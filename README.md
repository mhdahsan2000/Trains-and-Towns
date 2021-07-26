# TrainsAndTowns

Instruction to run the program from the terminal :
1. Go to path `src/`
2. Compile: `javac Main.java`
3. Execute: `java Main "AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7"`



Problem decscription : 
------------------------------------------------------------------------------------------------
The local passenger railway serves a number of cities. For monetary reasons, all train lines
follow only one direction. That is a route from city X to city Y, it does not mean that there is a
route from city Y to city X and even if this route exists there would be a different railway line
that could have a greater distance.
The purpose of this challenge is to help the railroad provide its customers with information
about the routes. In particular, you will calculate the distance along a given route, the
number of different routes between two cities and the shortest route between two cities.
Input:
A directed graph where a node represents a city and an edge represents a route between
two cities. The edge weighting represents the distance between the two cities. A certain
route will never appear more than once for a particular trip, the starting and ending city will
not be the same city.
Output:
For values from 1 to 5, if there is no such route, show something like "NO SUCH ROUTE".
Otherwise, follow the indicated route and do not make any extra stops! For example, the
value 1 to 5 means that the trip will start in city A, then the trip will continue directly to city B
(at a distance of 5), then directly to city C (at a distance of 4).
1. The distance of the route A-B-C.
2. The distance of the route A-D.
3. The distance of the route A-D-C.
4. The distance of the route A-E-B-C-D.
5. The distance of the route A-E-D.
6. The number of trips starting at C and ending at C with a maximum of 3 stops. In the
sample data below, there are two such trips: C-D-C (2 stops) and C-E-B-C (3 stops).
7. The number of trips starting at A and ending at C with exactly 4 stops. In the sample data
below, there are three such trips: A to C (via B,C,D); A to C (via D,C,D); and A to C (via
D,E,B).
8. The length of the shortest route (in terms of distance to travel) from A to C.
9. The length of the shortest route (in terms of distance to travel) from B to B.
10.The number of different routes from C to C with a distance of less than 30. In the sample
data, the trips are: CDC, CEBC, CEBCDC, CDCEBC, CDEBC, CEBCEBC, CEBCEBCEBC.
Test Input:
For test data entry, cities are named with the first letters of the alphabet as A, B, C and D.
The distance of a route between two cities (A to B) will have a distance of 5, so this value will
be represented as AB5.

Test graph: AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7

Output Expected:
Output # 1: 9
Output # 2: 5
Output # 3: 13
Output # 4: 22
Output # 5: NO SUCH ROUTE
Output # 6: 2
Output # 7: 3
Output # 8: 9
Output # 9: 9
Output # 10: 7


My Approach :
---------------------------------------------------------------------------------------

The given problem can be considered as Dijkstra’s shortest path finding problem. 
	 * BFS can be done to find if there would exist a path from one node to another or not. 
	 * And also to find the distance from one node to another(shortest) Djikstra’s algorithm can be used. 
	 * However in the program different functions are employed to compute the values of different operations.

	 *	Djikstra’s algorithm would find a shortest-path from a fixed start node. 
	 *	So the distances or edge weights can be represented as an adjacency matrix 
	 *	With a complexity of O(|V|^3).

      
OUTPUT EXPLAINED IN DETAIL : 
-----------------------------------------------------------------------------------------
     
     	 *      Output 1 : 9 -> for the input distance of the route A-B-C (A to B it’s 5 and B to C it’s 4 so a total of 9.)
	 *      Output 2: 5 -> for the input distance of the route A-D (A to D is 5 given )
	 *	Output 3: 13 -> for the input distance of route A-D-C (A to D it’s 5 and D to C it’s 8 so a total of 8+5 equal to 13. )
	 *	Output 4: 22 -> for the input distance of route A-E-B-C-D (A to E it’s 7, and E to B it’s 3 , B to C it’s 4 and C to D it’s 8, so a total of 7+3+4+8 = 10+12 = 22. )
	 *	Output 5: NO SUCH ROUTE -> for the input distance of route A-E-D (Although there is a route from A to E, there is no route from E to D.)
	 *	Output 6: 2 -> the number of trips starting at C and ending at C with a maximum of 3 stops. In the sample data below, there are two such trips: C-D-C (2 stops).[C to D one stop and D to C another stop] and C-E-B-C [C to E one stop, E to B stop, and B to C another stop](3 stops).
	 *	Output 7: 3 -> the number of trips starting at A and ending at C with exactly 4 stops. In the sample data below, there are three such trips: A to C (via B, C, D which would be A->B->C->D->A , A to B one stop, B to C second stop, C to D third stop, and D to A fourth stop ); A to C (via D, C, D, A to D one stop, D to C second stop, C to D third stop, D to A fourth stop); and A to C (via D, E, B ;  A to D first stop, D to E second stop, E to B third stop, and B to C fourth stop ).
	 *	Output 8: 9 -> the length of the shortest route (in terms of distance to travel) from A to C.(5+4 which is equal to 9, A to B and B to C so A to C)
	 *	Output 9: 9 -> the length of the shortest route (in terms of distance to travel) from B to B.
	 *	Output 10: 7 -> the number of different routes from C to C with a distance of less than 30. In the sample data, the trips are: CDC, CEBC, CEBCDC, CDCEBC, CDEBC, CEBCEBC, CEBCEBCEBC.
