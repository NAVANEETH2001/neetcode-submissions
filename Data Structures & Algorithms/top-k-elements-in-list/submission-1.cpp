
#include <vector>
#include <unordered_map>
#include <queue>

class Solution {
public:
    std::vector<int> topKFrequent(std::vector<int>& nums, int k) {
        // Step 1: Count the frequency of each element
        std::unordered_map<int, int> umap;
        for (int num : nums) {
            umap[num]++;
        }

        // Step 2: Use a min-heap to keep the top k frequent elements
        using pair_type = std::pair<int, int>;
        auto cmp = [](pair_type left, pair_type right) { return left.second > right.second; };
        std::priority_queue<pair_type, std::vector<pair_type>, decltype(cmp)> minHeap(cmp);

        for (const auto& entry : umap) {
            minHeap.push(entry);
            if (minHeap.size() > k) {
                minHeap.pop();
            }
        }

        // Step 3: Extract the elements from the min-heap
        std::vector<int> result;
        while (!minHeap.empty()) {
            result.push_back(minHeap.top().first);
            minHeap.pop();
        }

        // Optional: Reverse the result to return in descending order of frequency
        std::reverse(result.begin(), result.end());
        return result;
    }
};

