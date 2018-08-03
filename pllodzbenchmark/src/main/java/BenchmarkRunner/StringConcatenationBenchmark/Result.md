# String Concatenation vs String Builder Results

As expected String Builder is much more faster than String concatenation.

|Benchmark   	       |iterations   	    |Mode       |Cnt   	|Score   	|Error   	|Units  |
|:---:                   |:---:	                |:---:	    |:---:	|:---:	    |:---:	    |:---:	|    
|StringConcatenation   | 100   	            |thrpt   	|5   	|285,339   	|±   3,204  |ops/ms |
|StringConcatenation   | 200   	            |thrpt   	|5   	|131,366   	|±  28,804  |ops/ms |
|StringConcatenation   | 300   	            |thrpt   	|5   	| 97,640   	|±  36,753  |ops/ms |
|StringConcatenation   | 500   	            |thrpt   	|5   	| 60,124   	|±   4,480  |ops/ms |
|StringConcatenation   |1000   	            |thrpt   	|5   	| 30,614   	|±   4,391  |ops/ms |
|StringBuilder   	   | 100   	            |thrpt   	|5   	|≈ 10⁻⁴   	|   	    |ops/ms |
|StringBuilder   	   | 200   	            |thrpt   	|5   	|≈ 10⁻⁵   	|   	    |ops/ms |
|StringBuilder   	   | 300   	            |thrpt   	|5   	|≈ 10⁻⁵   	|   	    |ops/ms |
|StringBuilder   	   | 500   	            |thrpt   	|5   	|≈ 10⁻⁶   	|   	    |ops/ms |
|StringBuilder   	   |1000   	            |thrpt   	|5   	|≈ 10⁻⁶   	|   	    |ops/ms |




