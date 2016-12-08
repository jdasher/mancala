package mancala.model;

/**
 * @author jonathan
 * @version 0.2
 */

public class BoardModel {
	// Array of mancala pits
	int[] topPit = new int[6];
	int[] bottomPit = new int[6];
	// Array for player pits
	int[] player = new int[2];
	
	/**
	 * Game board layout
	 * 
	 * 										Top pits
	 * 										Pit Numbers
	 * 						0		1		2		3		4		5
	 * 										Initialized to 4
	 * 						4		4		4		4		4		4
	 * 
	 * 										Players
	 * 
	 * Player 1		0														0		Player 0
	 * 
	 * 										Bottom pits
	 * 										Initialized to 4
	 * 					 	4		4		4		4		4		4
	 * 										Pit Numbers
	 * 						0		1		2		3		4		5
	 */
	
	/**
	 * 
	 */
	public BoardModel() {
		for (int i = 0; i < 6; ++i) {
			topPit[i] = 4;
			bottomPit[i] = 4;
		}
		
		player[0] = 0;
		player[1] = 0;
		
		// For testing proper setup
		// TODO Remove
		/**
		System.out.println(player[0]);
		System.out.println(player[1]);
		
		for (int i = 0; i < 6; ++i) {
			System.out.println(topPit[i]);
			System.out.println(bottomPit[i]);
		}
		*/
	}
	
	/**
	 * 
	 * @param i
	 * @return
	 */
	public String getTopPit(int i) {
		return Integer.toString(topPit[i]);
	}
	
	/**
	 * 
	 * @param i
	 * @return
	 */
	public String getBottomPit(int i) {
		return Integer.toString(bottomPit[i]);
	}
	
	/**
	 * 
	 * @param i
	 * @return
	 */
	public String getPlayer(int i) {
		return Integer.toString(player[i]);
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean checkForWin() {
		// Totals of top/bottom rows
		int top = 0;
		int bottom = 0;
		
		// Summing top/bottom rows
		for (int i = 0; i < 6; ++i) {
			top += topPit[i];
			bottom += bottomPit[i];
		}
		
		// If sum of either is zero, game over
		if ((top == 0) || (bottom == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 
	 */
	public void newGame() {
		for (int i = 0; i < 6; ++i) {
			topPit[i] = 4;
			bottomPit[i] = 4;
		}
		
		player[0] = 0;
		player[1] = 0;		
	}
	
	/**
	 * 
	 * @param resumeTopPit
	 * @param resumeBottomPit
	 * @param resumePlayer
	 */
	public void resumeGame(int[] resumeTopPit, int[] resumeBottomPit, int[] resumePlayer) {

		for (int i = 0; i < 6; ++i) {
			topPit[i] = resumeTopPit[i];
			bottomPit[i] = resumeBottomPit[i];
		}
		
		player[0] = resumePlayer[0];
		player[1] = resumePlayer[1];
	}
	
	/**
	 * 
	 * @param playerNum
	 * @return
	 */
	public int endGame(int playerNum) {
		// Variable for total on each side
		int total = 0;
		
		// Check for player 1 or player 2
		if (playerNum == 0) {
			
			// Total of bottom for player 1
			for (int i = 0; i < 6; ++i) {
				total += bottomPit[i];
			}
			// If zero, game over
			if (total == 0) {
				return total;
			}
			
		} else if (playerNum == 1) {
			
			// Total of top for player 2
			for (int i = 0; i < 6; ++i) {
				total += topPit[i];
			}
			// If zero, game over
			if (total == 0) {
				return total;
			}
			
		} else {
			// TODO Remove
			System.out.println("ERROR: endGame in BoardModel");
		}
		
		return total;
	}
	
	/**
	 * 
	 * @param pitNum
	 * @return
	 */
	public boolean movePlayer1(int pitNum) {
		
		// Holds number in selected pit, sets pit to zero, and goes to next pit
		int temp = topPit[pitNum];
		topPit[pitNum] = 0;
		--pitNum;
		
		while (temp > 0) {
			switch (pitNum) {	
			case 5:
				++topPit[5];
				--temp;
				if (temp == 0) {
					if (topPit[5] == 1) {
						player[1] = player[1] + topPit[5] + bottomPit[5];
						bottomPit[5] = 0;
						topPit[5] = 0;
					}
					break;
				}	
			case 4:
				++topPit[4];
				--temp;
				if (temp == 0) {
					if (topPit[4] == 1) {
						player[1] = player[1] + topPit[4] + bottomPit[4];
						bottomPit[4] = 0;
						topPit[4] = 0;
					}
					break;
				}	
			case 3:
				++topPit[3];
				--temp;
				if (temp == 0) {
					if (topPit[3] == 1) {
						player[1] = player[1] + topPit[3] + bottomPit[3];
						bottomPit[3] = 0;
						topPit[3] = 0;
					}
					break;
				}
			case 2:
				++topPit[2];
				--temp;
				if (temp == 0) {
					if (topPit[2] == 1) {
						player[1] = player[1] + topPit[2] + bottomPit[2];
						bottomPit[2] = 0;
						topPit[2] = 0;
					}
					break;
				}	
			case 1:
				++topPit[1];
				--temp;
				if (temp == 0) {
					if (topPit[1] == 1) {
						player[1] = player[1] + topPit[1] + bottomPit[1];
						bottomPit[1] = 0;
						topPit[1] = 0;
					}
					break;
				}
			case 0:
				++topPit[0];
				--temp;
				if (temp == 0) {
					if (topPit[0] == 1) {
						player[1] = player[1] + topPit[0] + bottomPit[0];
						bottomPit[0] = 0;
						topPit[0] = 0;
					}
					break; 
				}
			default:
				++player[1];
				--temp;
				// Play again if ending in players own goal
				if (temp == 0) {
					return true;
				}
				
				// Continue across bottom row
				++bottomPit[0];
				--temp;
				if (temp == 0) {
					if (bottomPit[0] == 1) {
						player[1] = player[1] + topPit[0] + bottomPit[0];
						bottomPit[0] = 0;
						topPit[0] = 0;
					}
					break; 
				}
				
				++bottomPit[1];
				--temp;
				if (temp == 0) {
					if (bottomPit[1] == 1) {
						player[1] = player[1] + topPit[1] + bottomPit[1];
						bottomPit[1] = 0;
						topPit[1] = 0;
					}
					break;
				}
				
				++bottomPit[2];
				--temp;
				if (temp == 0) {
					if (bottomPit[2] == 1) {
						player[1] = player[1] + topPit[2] + bottomPit[2];
						bottomPit[2] = 0;
						topPit[2] = 0;
					}
					break;
				}
				
				++bottomPit[3];
				--temp;
				if (temp == 0) {
					if (bottomPit[3] == 1) {
						player[1] = player[1] + topPit[3] + bottomPit[3];
						bottomPit[3] = 0;
						topPit[3] = 0;
					}
					break;
				}

				++bottomPit[4];
				--temp;
				if (temp == 0) {
					if (bottomPit[4] == 1) {
						player[1] = player[1] + topPit[4] + bottomPit[4];
						bottomPit[4] = 0;
						topPit[4] = 0;
					}
					break;
				}

				++bottomPit[5];
				--temp;
				if (temp == 0 && bottomPit[5] == 1) {
					player[1] = player[1] + topPit[5] + bottomPit[5];
					bottomPit[5] = 0;
					topPit[5] = 0;
				}
				pitNum = 5;
				break;
			}
		}
		// Default return case, used if player picks empty pit
		return false;
	}
	
	/**
	 * 
	 * @param pitNum
	 * @return
	 */
	public boolean movePlayer0(int pitNum) {
		
		// Holds number in selected pit, sets pit to zero, and goes to next pit
		int temp = bottomPit[pitNum];
		bottomPit[pitNum] = 0;
		++pitNum;
		
		while (temp > 0) {
			switch (pitNum) {
			case 0:
				++bottomPit[0];
				--temp;
				if (temp == 0) {
					if (bottomPit[0] == 1) {
						player[0] = player[0] + topPit[0] + bottomPit[0];
						bottomPit[0] = 0;
						topPit[0] = 0;
					}
					break; 
				}
			case 1:
				++bottomPit[1];
				--temp;
				if (temp == 0) {
					if (bottomPit[1] == 1) {
						player[0] = player[0] + topPit[1] + bottomPit[1];
						bottomPit[1] = 0;
						topPit[1] = 0;
					}
					break;
				}
			case 2:
				++bottomPit[2];
				--temp;
				if (temp == 0) {
					if (bottomPit[2] == 1) {
						player[0] = player[0] + topPit[2] + bottomPit[2];
						bottomPit[2] = 0;
						topPit[2] = 0;
					}
					break;
				}
			case 3:
				++bottomPit[3];
				--temp;
				if (temp == 0) {
					if (bottomPit[3] == 1) {
						player[0] = player[0] + topPit[3] + bottomPit[3];
						bottomPit[3] = 0;
						topPit[3] = 0;
					}
					break;
				}
			case 4:
				++bottomPit[4];
				--temp;
				if (temp == 0) {
					if (bottomPit[4] == 1) {
						player[0] = player[0] + topPit[4] + bottomPit[4];
						bottomPit[4] = 0;
						topPit[4] = 0;
					}
					break;
				}
			case 5:
				++bottomPit[5];
				--temp;
				if (temp == 0) {
					if (bottomPit[5] == 1) {
						player[0] = player[0] + topPit[5] + bottomPit[5];
						bottomPit[5] = 0;
						topPit[5] = 0;
					}
					break;
				}
			default:
				++player[0];
				--temp;
				// Play again if ending in players own goal
				if (temp == 0) {
					return true;
				}
		
				// Continue across bottom row
				++topPit[5];
				--temp;
				if (temp == 0) {
					if (topPit[5] == 1) {
						player[0] = player[0] + topPit[5] + bottomPit[5];
						bottomPit[5] = 0;
						topPit[5] = 0;
					}
					break; 
				}
				
				++topPit[4];
				--temp;
				if (temp == 0) {
					if (topPit[4] == 1) {
						player[0] = player[0] + topPit[4] + bottomPit[4];
						bottomPit[4] = 0;
						topPit[4] = 0;
					}
					break; 
				}
				
				++topPit[3];
				--temp;
				if (temp == 0) {
					if (topPit[3] == 1) {
						player[0] = player[0] + topPit[3] + bottomPit[3];
						bottomPit[3] = 0;
						topPit[3] = 0;
					}
					break; 
				}
				
				++topPit[2];
				--temp;
				if (temp == 0) {
					if (topPit[2] == 1) {
						player[0] = player[0] + topPit[2] + bottomPit[2];
						bottomPit[2] = 0;
						topPit[2] = 0;
					}
					break; 
				}
				
				++topPit[1];
				--temp;
				if (temp == 0) {
					if (topPit[1] == 1) {
						player[0] = player[0] + topPit[1] + bottomPit[1];
						bottomPit[1] = 0;
						topPit[1] = 0;
					}
					break; 
				}
				
				++topPit[0];
				--temp;
				if (temp == 0 && topPit[0] == 1) {
					player[0] = player[0] + topPit[0] + bottomPit[0];
					bottomPit[0] = 0;
					topPit[0] = 0;
				}
				pitNum = 0;
				break;
			}
		}
		// Default return case, used if player picks empty pit
		return false;
	}
}