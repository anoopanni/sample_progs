"""Quick sort implementation"""


array = []

def swap(index1, index2):
    temp = array[index1]
    array[index1] = array[index2]
    array[index2] = temp


def partition(start, end):
   pivot = array[end]
   i = start
   for j in range(start, end):
       if array[j] <= pivot:
           swap(i, j)
           i+=1
           print("counter :", i)
   swap(i, end)
   return i 



array = [5, 2, 7, 8, 8]
print(partition(0,len(array)-1))
print(array)

def quicksort(start, end):
    if(start < end):
        partitionIndex = partition(start, end)
        quicksort(start, partitionIndex-1)
        quicksort(partitionIndex+1, end)



#array = [7,6,3,5,3,2]
#array = [5,3,2,5]
array = [2,2,5,4,2]
quicksort(0, len(array)-1)
print(array)
