
public class Maze_layout {
/* VARIABLES
 * ------------------------------------------------
 *   GRIDMAP ---
 *   int[][] gridArray - Array of all rooms
 *     1st Array - roomValid
 *     2nd Array - topographyDelta
 *   int roomValid - Determines validity of room
 *    -1 - Invalid Room
 *     0 - Unmodified room
 *     1 - Room preconnects north
 *     2 - Room preconnects east
 *     3 - Room preconnects south
 *     4 - Room preconnects west
 *     5 - Room preconnects up
 *     6 - Room preconnects down
 *   int topographyDelta - (0 - ???)
 *     determines vertical construction value
 *   int mapX - (1 - ???)
 *     guidemap horizontal unit dimension
 *   int mapY - (1 - ???)
 *     guidemap vertical unit dimension
 *   int mapZ - (1 - ???)
 *     guidemap layer unit dimension 
 *   
 *   PROBABILITY ---
 *   int probHorizontal - (0 - ???)
 *   int probVertical - (0 - ???)
 *   int probLayer - (0 - ???)
 *   
 * ------------------------------------------------
 * CONVENTIONS
 * ------------------------------------------------
 * PROCESS
 * ------------------------------------------------
 *   DATA COLLECTION ---
 *     Get probability modifiers
 *     Get grid
 *     
 *   DATA CLEANING ---
 *     PROBABILITY ---
 *       Establish valid probability
 *         (minimum 1 in two categories)   
 *     GRID ---
 *       Check grid for validity
 *         (minimum 1 connection in all rooms)
 *         (minimum 2 rooms)
 *         (dimensions match probability context)
 *         (topography check, no height differentials outside of delta)
 *         
 *   PROCESSING ---
 *     Select random point in available rooms
 *     Add first room to arraylist
 *     LOOP --
 *      Check which neighboring rooms are available
 *        if none move current room back one in list and remove old room from list
 *        if no rooms before this one in list EXIT
 *      Assemble randomization probability for available rooms
 *      Select a room
 *      Change current room to correct type to make connection to that room
 *      Move current room to new room
 *    	  Accommodate for preconnecting room
 *      Repeat Loop
 *        
 *   OUTPUT FINISHED GRID
 *      
 * ------------------------------------------------
 * 
 * 
 */
}
