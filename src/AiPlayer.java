import java.util.*;

/**
 * This is the AiPlayer class.  It simulates a minimax player for the max
 * connect four game.
 * The constructor essentially does nothing. 
 * 
 * @author james spargo
 *
 */

public class AiPlayer 
{
	private GameBoard b;
	private int maxDepth;
	
    public static int[][] evaluationTable = {{3, 4, 5, 7, 5, 4, 3}, 
											{4, 6, 8, 10, 8, 6, 4},
											{5, 8, 11, 13, 11, 8, 5}, 
											{5, 8, 11, 13, 11, 8, 5},
											{4, 6, 8, 10, 8, 6, 4},
											{3, 4, 5, 7, 5, 4, 3}};
		
    /**
     * The constructor essentially does nothing except instantiate an
     * AiPlayer object.
     *
     */
    public AiPlayer() 
    {
	// nothing to do here
    }

    
    public AiPlayer(GameBoard b, int maxDepth) 
    {
		this.b = b;
		this.maxDepth = maxDepth;
    }
    
    /**
     * This method plays a piece randomly on the board
     * @param currentGame The GameBoard object that is currently being used to
     * play the game.
     * @return an integer indicating which column the AiPlayer would like
     * to play in.
     */
    private int minimax(GameBoard board, int depth, boolean isMaxPlayer, int alpha, int beta) {
    	
    }
    
    public int evaluateContent() {
    	
    }
    
    public int findBestPlay( GameBoard currentGame ) 
    {
	// start random play code
	Random randy = new Random();
	int playChoice = 99;
	
	playChoice = randy.nextInt( 7 );
	
	while( !currentGame.isValidPlay( playChoice ) )
	    playChoice = randy.nextInt( 7 );
	
	// end random play code
	
	return playChoice;
    }
}