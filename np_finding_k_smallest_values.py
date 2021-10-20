
# Finding the k smallest values of a NumPy array


# importing the module
import numpy as np

# creating the array
arr = np.array([23, 12, 1, 3, 4, 5, 6])
print("The Original Array Content")
print(arr)

# value of k
k = 4

# using np.argpartition()
result = np.argpartition(arr, k)

# k smallest number of array
print(k, "smallest elements of the array")
print(arr[result[:k]])
