// Change main to a separate method:

public static int[] intersection(int[] nums1, int[] nums2) {
    
    ArrayList<Integer> unique = new ArrayList<>();
    HashMap<Integer, Integer> map1 = new HashMap<>();
    HashMap<Integer, Integer> map2 = new HashMap<>();

    for (int x : nums1) {
        map1.put(x, map1.getOrDefault(x, 0) + 1);
    }
    for (int x : nums2) {
        map2.put(x, map2.getOrDefault(x, 0) + 1);
    }
    for (int x : map1.keySet()) {
        if (map2.containsKey(x)) {
            unique.add(x);
        }
    }

    // Convert ArrayList to int[] for return
    int[] result = new int[unique.size()];
    for (int i = 0; i < unique.size(); i++) {
        result[i] = unique.get(i);
    }
    return result;
}

public static void main(String[] args) {
    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2, 2};
    System.out.println(Arrays.toString(intersection(nums1, nums2)));
}