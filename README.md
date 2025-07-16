# Sorting Algorithms Performance Analysis

A comprehensive Java implementation and performance analysis of two advanced sorting algorithms: **ShellSort** and **DualPivotQuickSort**.

## 📋 Project Overview

This project implements and analyzes two sorting algorithms as part of CME 2204 Assignment 1:
- **ShellSort**: An improved version of insertion sort using gap sequences
- **DualPivotQuickSort**: A variant of quicksort using two pivots for enhanced performance

## 🔧 Implementation Details

### ShellSort Algorithm
- Uses Shell's original gap sequence: ⌊N/2⌋, ⌊N/4⌋, ⌊N/8⌋, ..., 1
- Breaks the array into subarrays using gap intervals
- Performs insertion sort on each subarray
- Continues until gap reaches 1

### DualPivotQuickSort Algorithm
- Uses two pivots: Left Pivot (LP) and Right Pivot (RP)
- Partitions array into three sections:
  - Elements < LP
  - Elements ≥ LP and ≤ RP  
  - Elements > RP
- Recursively sorts each partition

## 📊 Performance Analysis

The project includes comprehensive runtime analysis across different data patterns:

### Test Data Types
- **Equal Integers**: All elements have the same value
- **Random Integers**: Randomly distributed values
- **Increasing Integers**: Sorted in ascending order
- **Decreasing Integers**: Sorted in descending order

### Test Sizes
- 1,000 elements
- 10,000 elements  
- 100,000 elements

## 🛠️ Technology Stack

- **Language**: Java
- **Testing Framework**: Custom performance measurement
- **Time Measurement**: `System.nanoTime()` for high precision

## 📁 Project Structure

```
src/
├── Sort.java              # Sorting algorithms implementation
├── Main.java              # Test runner and performance measurement
└── README.md              # This file
```

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line or Java IDE

### Compilation and Execution
```bash
# Compile the project
javac *.java

# Run the performance analysis
java Main
```

### Menu Options
1. **Equal Integers**: Test with arrays of identical values
2. **Decreasing Integers**: Test with reverse-sorted arrays
3. **Increasing Integers**: Test with pre-sorted arrays
4. **Random Integers**: Test with randomly distributed values

### Size Selection
- **a**: 1,000 elements
- **b**: 10,000 elements  
- **c**: 100,000 elements

## 📈 Performance Results

The program outputs timing results in milliseconds for both algorithms:

```
Shell Sort Equal 1.000: X.XX ms
Dual Pivot Quick Sort Equal 1.000: X.XX ms
Shell Sort Decreasing 1.000: X.XX ms
Dual Pivot Quick Sort Decreasing 1.000: X.XX ms
...
```

## 🔬 Algorithm Analysis

### ShellSort
- **Best Case**: O(n log n)
- **Average Case**: O(n^1.5)
- **Worst Case**: O(n^2)
- **Space Complexity**: O(1)

### DualPivotQuickSort
- **Best Case**: O(n log n)
- **Average Case**: O(n log n)
- **Worst Case**: O(n^2)
- **Space Complexity**: O(log n)

## 🎯 Use Case Scenarios

### Scenario A: Student University Placement (3 Million Students)
**Recommendation**: DualPivotQuickSort
- Better average-case performance for large datasets
- More efficient for random data distribution
- Lower memory overhead

### Scenario B: Dictionary Translation (Thousands of Words)
**Recommendation**: ShellSort
- Better performance on partially sorted data
- Stable sorting algorithm
- Consistent performance across different input types

## 🧪 Testing Methodology

Performance measurement excludes array generation time:
```java
long startTime = System.nanoTime();
sortingAlgorithm(array);
long endTime = System.nanoTime();
double duration = (endTime - startTime) / 1_000_000.0; // Convert to ms
```

## 📚 Key Features

- **Accurate Timing**: Uses nanosecond precision for reliable measurements
- **Multiple Data Patterns**: Tests all common sorting scenarios
- **Scalable Testing**: Three different input sizes for comprehensive analysis
- **Interactive Menu**: Easy-to-use command-line interface
- **Detailed Output**: Clear performance comparisons

## 🔄 Algorithm Implementations

Both algorithms are implemented in the `Sort` class:
- `shellSort(int[] array)`: Shell's sorting algorithm
- `dualPivotQuickSort(int[] array, int low, int high)`: Dual-pivot quicksort

## 📖 Educational Value

This project demonstrates:
- Advanced sorting algorithm implementation
- Performance analysis techniques
- Algorithm complexity comparison
- Real-world application scenarios
- Scientific methodology in algorithm evaluation

## 🏆 Academic Context

Developed as part of CME 2204 (Computer Engineering) coursework focusing on:
- Algorithm design and analysis
- Performance optimization
- Empirical algorithm evaluation
- Technical report writing

## 📄 License

This project is for educational purposes as part of university coursework.

## 👨‍💻 Author

**İrem** - Computer Engineering Student
- GitHub: [@iremt11](https://github.com/iremt11)

---

**Note**: This implementation is part of academic coursework and serves as a practical demonstration of sorting algorithm performance analysis.
