import java.util.*;

class SubSets {
    public Set<Set<Integer>> getSubSets(Set<Integer> inputSet) {
        Set<Set<Integer>> allSubsets = new HashSet<>();
        List<Integer> list = new ArrayList<>(inputSet);
        getSubSets(list, 0, new HashSet<Integer>(), allSubsets);
        return allSubsets;
    }

    public void getSubSets(List<Integer> arr, int vidx, Set<Integer> temp, Set<Set<Integer>> big) {
        if (vidx == arr.size()) {
            big.add(new HashSet<>(temp));
            return;
        }

        temp.add(arr.get(vidx));
        getSubSets(arr, vidx + 1, temp, big);

        temp.remove(arr.get(vidx));
        getSubSets(arr, vidx + 1, temp, big);
    }

}
