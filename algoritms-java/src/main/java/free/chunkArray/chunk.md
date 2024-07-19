Problem

Given an array and chunk size, divide the array into many subarrays where each subarray is of length size

chunk([1,2,3,4],2) --> [[1,2], [3,4]]
chunk([1,2,3,4,5],2) --> [[1,2], [3,4], [5]]
chunk([1,2,3,4,5,6,7,8],3) --> [[1,2,3], [4,5,6],[7,8]]
chunk([1,2,3,4,5],10) --> [[1,2,3,4,5]]

PSEUDOCODE
START
1-create emtpy array to hod chunks called 'chunked'
2-for each element in the unchunked array
3-Retrieve the last element in chunked
4-if last element does not exists, or if its length is equal to chunk size
5-push a new chunk into 'chunked' with the current element
6-else add the current element into the chunk
END
