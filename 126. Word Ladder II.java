import java.util.*;

class Solution {
    public List<List<String>> findLadders(
            String beginWord,
            String endWord,
            List<String> wordList) {

        List<List<String>> result = new ArrayList<>();
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) return result;

        // parent map: word -> list of previous words
        Map<String, List<String>> parents = new HashMap<>();
        Set<String> currentLevel = new HashSet<>();
        currentLevel.add(beginWord);

        boolean found = false;

        while (!currentLevel.isEmpty() && !found) {
            dict.removeAll(currentLevel);
            Set<String> nextLevel = new HashSet<>();

            for (String word : currentLevel) {
                char[] arr = word.toCharArray();

                for (int i = 0; i < arr.length; i++) {
                    char original = arr[i];

                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == original) continue;
                        arr[i] = c;
                        String next = new String(arr);

                        if (dict.contains(next)) {
                            nextLevel.add(next);
                            parents
                                .computeIfAbsent(next, k -> new ArrayList<>())
                                .add(word);
                            if (next.equals(endWord)) found = true;
                        }
                    }
                    arr[i] = original;
                }
            }
            currentLevel = nextLevel;
        }

        if (found) {
            List<String> path = new ArrayList<>();
            dfs(endWord, beginWord, parents, path, result);
        }

        return result;
    }

    private void dfs(String word, String beginWord,
                     Map<String, List<String>> parents,
                     List<String> path,
                     List<List<String>> result) {

        path.add(word);

        if (word.equals(beginWord)) {
            List<String> temp = new ArrayList<>(path);
            Collections.reverse(temp);
            result.add(temp);
        } else if (parents.containsKey(word)) {
            for (String parent : parents.get(word)) {
                dfs(parent, beginWord, parents, path, result);
            }
        }

        path.remove(path.size() - 1);
    }
}
