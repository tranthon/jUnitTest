# jUnitTest
Code Implementation and Testing using JUnit and Mockito frameworks

Unit Tests with the JUnit framework:

A component named, ArrayFlattener, as a Java command-line (console) application. In the component (class), a method named, flattenArray(), which takes as input, a two dimensional (2-D) nested array and returns as output, the flattened array (i.e. a one dimensional array containing the nested arrays, flattened)

Using JUnit, implemented unit tests for the ArrayFlattener component and its flattenArray() method; covering the following 2 test-cases:

a. When the input is a legit 2-D nested array, [[1,3], [0], [4,5,9]].

b. When the input is a null.

A JUnit TestSuite containing the 2 test-cases defined above.


Unit Testing and mocking a remote service, using JUnit and Mockito frameworks: 

Code for a component named, ArrayReversor, as a Java command-line (console) application. In the component (class), a method named, reverseArray(), which takes as input, a two dimensional (2-D) nested array and returns as output, the reverse of the flattened array (i.e. a one dimensional array containing elements of the nested array, flattened and reversed).

Unit tests for the ArrayReversor component and its reverseArray() method; covering the following two test-cases:

a. When the input is a legit 2-D nested array, such as [[1,3], [0], [4,5,9]].

b. When the input is a null.

In both of the unit test-cases, verifies that the ArrayFlattenerService was indeed invoked and not just by-passed (e.g. by harding-coding the correct expected result/output from its invocation).

Created a JUnit TestSuite named, ArrayReversorTestCases, containing the 2 test cases.
