package me.rajpp;

import java.util.Random;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends Game {

    
	private SpriteBatch batch;
	private Texture img;
	private DeckStack playerDeck;
	private DeckStack botDeck;
	private DeckStack middleDeck;
	
	
	private Boolean playerTurn;
	
	//used in the draw method
	private Boolean endDraw = false;
	
	private Texture rectangle;
	private Texture zero;
	private Texture one;
	private Texture two;
	private Texture three;
	private Texture four;
	private Texture five;
	private Texture six;
	private Texture seven;
	private Texture eight;
	private Texture nine;
	private Texture ten;
	private Texture eleven;
	private Texture twelve;
	private Texture thirteen;
	private Texture fourteen;
	private Texture fifteen;
	private Texture sixteen;
	private Texture seventeen;
	private Texture eighteen;
	private Texture nineteen;
	private Texture twenty;
	private Texture twentyOne;
	private Texture twentyTwo;
	private Texture twentyThree;
	private Texture twentyFour;
	private Texture twentyFive;
	private Texture twentySix;
	private Texture twentySeven;
	private Texture twentyEight;
	private Texture twentyNine;
	private Texture thirty;
	private Texture thirtyOne;
	private Texture thirtyTwo;
	private Texture thirtyThree;
	private Texture thirtyFour;
	private Texture thirtyFive;
	private Texture thirtySix;
	private Texture thirtySeven;
	private Texture thirtyEight;
	private Texture thirtyNine;
	private Texture forty;
	private Texture fortyOne;
	private Texture fortyTwo;
	private Texture fortyThree;
	private Texture fortyFour;
	private Texture fortyFive;
	private Texture fortySix;
	private Texture fortySeven;
	private Texture fortyEight;
	private Texture fortyNine;
	private Texture fifty;
	private Texture fiftyOne;
	private Texture fiftyTwo;
	
	private Texture foldbutton;
	
	private Texture backofCard1;
	private Texture backOfCard2;
	private Texture backOfCard3;
	private Texture backOfCard4;

	private Texture aceOfHearts;
	private Texture twoOfHearts;
	private Texture threeOfHearts;
	private Texture fourOfHearts;
	private Texture fiveOfHearts;
	private Texture sixOfHearts;
	private Texture sevenOfHearts;
	private Texture eightOfHearts;
	private Texture nineOfHearts;
	private Texture tenOfHearts;
	private Texture jackOfHearts;
	private Texture queenOfHearts;
	private Texture kingOfHearts;
	private Texture aceOfDiamonds;
	private Texture twoOfDiamonds;
	private Texture threeOfDiamonds;
	private Texture fourOfDiamonds;
	private Texture fiveOfDiamonds;
	private Texture sixOfDiamonds;
	private Texture sevenOfDiamonds;
	private Texture eightOfDiamonds;
	private Texture nineOfDiamonds;
	private Texture tenOfDiamonds;
	private Texture jackOfDiamonds;
	private Texture queenOfDiamonds;
	private Texture kingOfDiamonds;
	private Texture aceOfClubs;
	private Texture twoOfClubs;
	private Texture threeOfClubs;
	private Texture fourOfClubs;
	private Texture fiveOfClubs;
	private Texture sixOfClubs;
	private Texture sevenOfClubs;
	private Texture eightOfClubs;
	private Texture nineOfClubs;
	private Texture tenOfClubs;
	private Texture jackOfClubs;
	private Texture queenOfClubs;
	private Texture kingOfClubs;
	private Texture aceOfSpades;
	private Texture twoOfSpades;
	private Texture threeOfSpades;
	private Texture fourOfSpades;
	private Texture fiveOfSpades;
	private Texture sixOfSpades;
	private Texture sevenOfSpades;
	private Texture eightOfSpades;
	private Texture nineOfSpades;
	private Texture tenOfSpades;
	private Texture jackOfSpades;
	private Texture queenOfSpades;
	private Texture kingOfSpades;
	

	//SOUNDS
	private Sound penalty;
	private Sound cardDown;
	private Sound yay;
	
	public void startGame()
	{
	    playerDeck = new DeckStack();
	    botDeck = new DeckStack();
	    middleDeck = new DeckStack();
	   
	}
	
	@Override
	public void create () {
		//SOUNDS
		penalty = Gdx.audio.newSound(Gdx.files.internal("Boom.mp3"));
		cardDown = Gdx.audio.newSound(Gdx.files.internal("CardSnap.mp3"));
		yay = Gdx.audio.newSound(Gdx.files.internal("Yay.mp3"));
		
		//IMAGES
	    backofCard1  = new Texture("BackofCard1.png");
		batch = new SpriteBatch();
		img = new Texture("desertbackground.png");
		backOfCard2 = new Texture("BackOfCard2.png");
		backOfCard3 = new Texture(Gdx.files.internal("BackOfCard3.png"));
	    backOfCard4 = new Texture(Gdx.files.internal("BackOfCard4.png"));
	    
	    foldbutton = new Texture(Gdx.files.internal("foldbutton.png"));
	    
	    rectangle = new Texture(Gdx.files.internal("rectangle.png"));
	    zero = new Texture(Gdx.files.internal("0.png"));
	    one = new Texture(Gdx.files.internal("1.png"));
	    two = new Texture(Gdx.files.internal("2.png"));
	    three = new Texture(Gdx.files.internal("3.png"));
	    four = new Texture(Gdx.files.internal("4.png"));
	    five = new Texture(Gdx.files.internal("5.png"));
	    six = new Texture(Gdx.files.internal("6.png"));
	    seven = new Texture(Gdx.files.internal("7.png"));
	    eight = new Texture(Gdx.files.internal("8.png"));
	    nine = new Texture(Gdx.files.internal("9.png"));
	    ten = new Texture(Gdx.files.internal("10.png"));
	    eleven = new Texture(Gdx.files.internal("11.png"));
	    twelve = new Texture(Gdx.files.internal("12.png"));
	    thirteen = new Texture(Gdx.files.internal("13.png"));
	    fourteen = new Texture(Gdx.files.internal("14.png"));
	    fifteen = new Texture(Gdx.files.internal("15.png"));
	    sixteen = new Texture(Gdx.files.internal("16.png"));
	    seventeen = new Texture(Gdx.files.internal("17.png"));
	    eighteen = new Texture(Gdx.files.internal("18.png"));
	    nineteen = new Texture(Gdx.files.internal("19.png"));
	    twenty = new Texture(Gdx.files.internal("20.png"));
	    twentyOne = new Texture(Gdx.files.internal("21.png"));
	    twentyTwo = new Texture(Gdx.files.internal("22.png"));
	    twentyThree = new Texture(Gdx.files.internal("23.png"));
	    twentyFour = new Texture(Gdx.files.internal("24.png"));
	    twentyFive = new Texture(Gdx.files.internal("25.png"));
	    twentySix = new Texture(Gdx.files.internal("26.png"));
	    twentySeven = new Texture(Gdx.files.internal("27.png"));
	    twentyEight = new Texture(Gdx.files.internal("28.png"));
	    twentyNine = new Texture(Gdx.files.internal("29.png"));
	    thirty = new Texture(Gdx.files.internal("30.png"));
	    thirtyOne = new Texture(Gdx.files.internal("31.png"));
	    thirtyTwo = new Texture(Gdx.files.internal("32.png"));
	    thirtyThree = new Texture(Gdx.files.internal("33.png"));
	    thirtyFour = new Texture(Gdx.files.internal("34.png"));
	    thirtyFive = new Texture(Gdx.files.internal("35.png"));
	    thirtySix = new Texture(Gdx.files.internal("36.png"));
	    thirtySeven = new Texture(Gdx.files.internal("37.png"));
	    thirtyEight = new Texture(Gdx.files.internal("38.png"));
	    thirtyNine = new Texture(Gdx.files.internal("39.png"));
	    forty = new Texture(Gdx.files.internal("40.png"));
	    fortyOne = new Texture(Gdx.files.internal("41.png"));
	    fortyTwo = new Texture(Gdx.files.internal("42.png"));
	    fortyThree = new Texture(Gdx.files.internal("43.png"));
	    fortyFour = new Texture(Gdx.files.internal("44.png"));
	    fortyFive = new Texture(Gdx.files.internal("45.png"));
	    fortySix = new Texture(Gdx.files.internal("46.png"));
	    fortySeven = new Texture(Gdx.files.internal("47.png"));
	    fortyEight = new Texture(Gdx.files.internal("48.png"));
	    fortyNine = new Texture(Gdx.files.internal("49.png"));
	    fifty = new Texture(Gdx.files.internal("50.png"));
	    fiftyOne = new Texture(Gdx.files.internal("51.png"));
	    fiftyTwo = new Texture(Gdx.files.internal("52.png"));
	    
	    aceOfHearts = new Texture(Gdx.files.internal("AceOfHearts.png"));
	    twoOfHearts = new Texture(Gdx.files.internal("TwoOfHearts.png"));
	    threeOfHearts = new Texture(Gdx.files.internal("ThreeOfHearts.png"));
	    fourOfHearts = new Texture(Gdx.files.internal("FourOfHearts.png"));
	    fiveOfHearts = new Texture(Gdx.files.internal("FiveOfHearts.png"));
	    sixOfHearts = new Texture(Gdx.files.internal("SixOfHearts.png"));
	    sevenOfHearts = new Texture(Gdx.files.internal("SevenOfHearts.png"));
	    eightOfHearts = new Texture(Gdx.files.internal("EightOfHearts.png"));
	    nineOfHearts = new Texture(Gdx.files.internal("NineOfHearts.png"));
	    tenOfHearts = new Texture(Gdx.files.internal("TenOfHearts.png"));
	    jackOfHearts = new Texture(Gdx.files.internal("JackOfHearts.png"));
	    queenOfHearts = new Texture(Gdx.files.internal("QueenOfHearts.png"));
	    kingOfHearts = new Texture(Gdx.files.internal("KingOfHearts.png"));
	    aceOfDiamonds = new Texture(Gdx.files.internal("AceOfDiamonds.png"));
	    twoOfDiamonds = new Texture(Gdx.files.internal("TwoOfDiamonds.png"));
	    threeOfDiamonds = new Texture(Gdx.files.internal("ThreeOfDiamonds.png"));
	    fourOfDiamonds = new Texture(Gdx.files.internal("FourOfDiamonds.png"));
	    fiveOfDiamonds = new Texture(Gdx.files.internal("FiveOfDiamonds.png"));
	    sixOfDiamonds = new Texture(Gdx.files.internal("SixOfDiamonds.png"));
	    sevenOfDiamonds = new Texture(Gdx.files.internal("SevenOfDiamonds.png"));
	    eightOfDiamonds = new Texture(Gdx.files.internal("EightOfDiamonds.png"));
	    nineOfDiamonds = new Texture(Gdx.files.internal("NineOfDiamonds.png"));
	    tenOfDiamonds = new Texture(Gdx.files.internal("TenOfDiamonds.png"));
	    jackOfDiamonds = new Texture(Gdx.files.internal("JackOfDiamonds.png"));
	    queenOfDiamonds = new Texture(Gdx.files.internal("QueenOfDiamonds.png"));
	    kingOfDiamonds = new Texture(Gdx.files.internal("KingOfDiamonds.png"));
	    aceOfClubs = new Texture(Gdx.files.internal("AceOfClubs.png"));
	    twoOfClubs = new Texture(Gdx.files.internal("TwoOfClubs.png"));
	    threeOfClubs = new Texture(Gdx.files.internal("ThreeOfClubs.png"));
	    fourOfClubs = new Texture(Gdx.files.internal("FourOfClubs.png"));
	    fiveOfClubs = new Texture(Gdx.files.internal("FiveOfClubs.png"));
	    sixOfClubs = new Texture(Gdx.files.internal("SixOfClubs.png"));
	    sevenOfClubs = new Texture(Gdx.files.internal("SevenOfClubs.png"));
	    eightOfClubs = new Texture(Gdx.files.internal("EightOfClubs.png"));
	    nineOfClubs = new Texture(Gdx.files.internal("NineOfClubs.png"));
	    tenOfClubs = new Texture(Gdx.files.internal("TenOfClubs.png"));
	    jackOfClubs = new Texture(Gdx.files.internal("JackOfClubs.png"));
	    queenOfClubs = new Texture(Gdx.files.internal("QueenOfClubs.png"));
	    kingOfClubs = new Texture(Gdx.files.internal("KingOfClubs.png"));
	    aceOfSpades = new Texture(Gdx.files.internal("AceOfSpades.png"));
	    twoOfSpades = new Texture(Gdx.files.internal("TwoOfSpades.png"));
	    threeOfSpades = new Texture(Gdx.files.internal("ThreeOfSpades.png"));
	    fourOfSpades = new Texture(Gdx.files.internal("FourOfSpades.png"));
	    fiveOfSpades = new Texture(Gdx.files.internal("FiveOfSpades.png"));
	    sixOfSpades = new Texture(Gdx.files.internal("SixOfSpades.png"));
	    sevenOfSpades = new Texture(Gdx.files.internal("SevenOfSpades.png"));
	    eightOfSpades = new Texture(Gdx.files.internal("EightOfSpades.png"));
	    nineOfSpades = new Texture(Gdx.files.internal("NineOfSpades.png"));
	    tenOfSpades = new Texture(Gdx.files.internal("TenOfSpades.png"));
	    jackOfSpades = new Texture(Gdx.files.internal("JackOfSpades.png"));
	    queenOfSpades = new Texture(Gdx.files.internal("QueenOfSpades.png"));
	    kingOfSpades = new Texture(Gdx.files.internal("KingOfSpades.png"));
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 0);
		batch.begin();
		Gdx.graphics.setWindowedMode(540, 960);
		batch.draw(img, 0, 0, img.getWidth(), img.getHeight());
	    batch.getProjectionMatrix().setToOrtho2D(0, 0, 540, 960);
	    
	    startGame();
	    initalize();
	    
	    batch.draw(backOfCard3, 185, 10, 138, 201);
	    
	    
	    batch.draw(aceOfSpades, 147, 277, 250, 401);
	    middleDeck.push(new Card("spade", 2));
	    
	    batch.draw(backOfCard2, 185, 749, 138, 201); 
	    
	    
	    //when the person puts down a card
	    //play();
	    
	    //when the person slaps
	    //slaps();
	    
	    //after the round is over
	    //botplay();
	    
	    if(Gdx.input.isKeyPressed(Input.Keys.ENTER)){
        	play(); 
        	//
        	botPlay();
        	}
	    
	      if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){
	        	slap();
	        }
	      
	      
	    

	    //maybe add a pointer signifying whose turn it is
		batch.end();
		super.render();
		
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
	
	public void play()
	{
	    Random rand = new Random();
        int randomChange = rand.nextInt(4) + 1;
        //updateCounter();
	    if(playerDeck.size() != 0)
	    {
	        middleDeck.push(playerDeck.pop());
	        batch.draw(cardImage(middleDeck.peek()), 147 - randomChange, 277 - randomChange, 250, 401);
	    }
	    else
	    {
	        //player loses
	    	penalty.play(1.0f);
	    	System.exit(0);
	    }
	    if(ifFaceCard())
	    {
	        //make it say how many to draw
	        draw(findDrawAmount());
	        changeTurn();
	    }
//	    else
//	    {
//	        changeTurn();
//	        middleDeck.push(botDeck.pop());
//	        batch.draw(cardImage(middleDeck.peek()), 147 - randomChange, 277 - randomChange, 250, 401);
//	        if(ifFaceCard())
//	        {
//	            draw(findDrawAmount());
//	        }
//	    }
	    
	   
	}
	
	public void slap()
	{
	    if(slapable())
	    {
	        if(getTurn())
            {
                for(int i = 0; i < middleDeck.size(); i++)
                {
                    Random rand = new Random();
                    int randomChange = i * (rand.nextInt(4) + 1);
                    playerDeck.push(middleDeck.pop());
                    batch.draw(backOfCard3, 147 - randomChange, 277 - randomChange, 250, 401);
                }
            }
	      //updateCounter();
            else
            {
                for(int i = 0; i < middleDeck.size(); i++)
                {
                    Random rand = new Random();
                    int randomChange = i * (rand.nextInt(4) + 1);
                    botDeck.push(middleDeck.pop());
                    batch.draw(backOfCard3, 147 - randomChange, 277 - randomChange, 250, 401);
                }
            } 
	    }
	    else
	    {
	        //get mad
	        //remember win conditions
	    	//sound effect, 
	    	penalty.play(1.0f);
	    	
	    }
	}
	
	public void updateCounter()
	{
        batch.draw(numberTexture(botDeck.size()), 77, 107, 71, 50);
        batch.draw(rectangle, 58, 98, 107, 65);
        
        batch.draw(numberTexture(botDeck.size()), 385, 799, 71, 50);
        batch.draw(rectangle, 366, 791, 107, 65);
	}
	
	
	public void botPlay()
	{
	    Random rand = new Random();
	    if(slapable())
	    {
	        int num = rand.nextInt(100)+ 1;
	        if(num > 50)
	        {
	            slap();
	        }
	    }
	    
	    if(botDeck.size() != 0)
        {
            middleDeck.push(botDeck.pop());
            batch.draw(cardImage(middleDeck.peek()), 147, 277, 250, 401);
        }
	    else
	    {
	        //play wins
	    	yay.play(1.0f);
	    	System.exit(0);
	    }
	    if(ifFaceCard())
        {
            //make it say how many to draw
            draw(findDrawAmount());
            changeTurn();
        }
	    else
	    {
	        changeTurn();
	    }
	}
	
	
	public void initalize()
	{
	    DeckStack originalDeck = new DeckStack();
	    String[] suits = {"club", "diamond", "heart", "spade"};
	    int[] rank = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	    
	    for(int num: rank)
	    {
	        for(String suit: suits)
	        {
	            originalDeck.push(new Card(suit, num));
	        }
	    }
	    
	    DeckStack shuffledDeck = randomize(originalDeck);
	    
	    for(int i = 0; i < 52; i++)
	    {
	        playerDeck.push(shuffledDeck.pop());
	        botDeck.push(shuffledDeck.pop());
	    }    
	}
	
	public DeckStack randomize(DeckStack deck)
	{
	    Random rand = new Random();
	    
	    DeckStack newDeck = new DeckStack();
	    int findCard;
	    
	    for(int i = 0; i < 52; i++)
	    {
	        findCard = rand.nextInt(deck.size());
	        newDeck.push(deck.pop(findCard));
	    }
	    
	    return newDeck;     
	}
	
	public void draw(int amount)
    {
	    if(endDraw == false)
	    {
            boolean drewAll = true;
	        if(getTurn())
	        {
	            for(int i = 0; i < amount; i++)
                {
                    middleDeck.push(botDeck.pop());
                    batch.draw(cardImage(middleDeck.peek()), 147, 277, 250, 401);
                    if(ifFaceCard())
                    {
                        draw(findDrawAmount());
                        drewAll = false;
                    }
                    else
                    {
                        drewAll = true;
                    }
                }
	        }
	        else
	        {
	            for(int i = 0; i < amount; i++)
                {
                    middleDeck.push(playerDeck.pop());
                    batch.draw(cardImage(middleDeck.peek()), 147, 277, 250, 401);
                    if(ifFaceCard())
                    {
                        draw(findDrawAmount());
                        drewAll = false;
                    }
                    else
                    {
                        drewAll = true;
                    }
                }
	        }
            if(drewAll == true)
            {
                if(getTurn())
                {
                    for(int i = 0; i < middleDeck.size(); i++)
                    {
                        Random rand = new Random();
                        int randomChange = i * (rand.nextInt(4) + 1);
                        playerDeck.push(middleDeck.pop());
                        batch.draw(backOfCard3, 147 - randomChange, 277 - randomChange, 250, 401);
                    }
                    endDraw = true;
                }
                else
                {
                    for(int i = 0; i < middleDeck.size(); i++)
                    {
                        Random rand = new Random();
                        int randomChange = i * (rand.nextInt(4) + 1);
                        botDeck.push(middleDeck.pop());
                        batch.draw(backOfCard3, 147 - randomChange, 277 - randomChange, 250, 401);
                    }
                    endDraw = true;
                }
            }
	    }
	    else
	    {
	        return;
	    }
    }
    
    public boolean getTurn()
    {
        return playerTurn;
    }
    
    public void changeTurn()
    {
        playerTurn = !playerTurn;
        
    }
    
	public int findDrawAmount()
	{
	    int topCard = middleDeck.peek().getRank();
	    
	    switch(topCard)
	    {
	        case 1:
	            return 4;
	        
	        case 11:
	            return 1;
	            
	        case 12:
	            return 2;
	            
	        case 13:
	            return 3;
	    }
	    return -1;
	}
	
	public boolean ifFaceCard()
	{
		int topCard = 0;
		try
		{
			topCard = middleDeck.peek().getRank();
		}
		catch(NullPointerException e)
		{
			middleDeck.toString();
		}
	    if(topCard == 1 || topCard == 11 || topCard == 12 || topCard == 13)
	    {
	        return true;
	    }
	    return false;
	}
	
	
	public boolean slapable()
	{
	    try {
	        return doubles() || marriage() || topBottom() || sandwich();
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	        return false;
	    }
	}
	
	public boolean doubles()
	{
		try {
		if(middleDeck.size() > 1)
		//	return middleDeck.peek().getRank() == middleDeck.get(middleDeck.size() - 2).getRank();
			return middleDeck.pop().getRank() == middleDeck.get(middleDeck.size() - 2).getRank();
		return false;
		}
		catch(NullPointerException e)
		{
			return false;
		}
	}
	
	public boolean marriage()
	{
		if(middleDeck.size() > 1)
		{
		    if(middleDeck.peek().getRank() == 13)
		    {
		        if(middleDeck.get(middleDeck.size() - 2).getRank() == 12)
		        {
		            return true;
		        }
		    }
		    else if(middleDeck.peek().getRank() == 12)
		    {
		        if(middleDeck.get(middleDeck.size() - 2).getRank() == 13)
	            {
	                return true;
	            }
		    }
		    return false;
		}
		return false;
	}
	
	public boolean topBottom()
	{
		if(middleDeck.size() > 1)
			return middleDeck.peek().getRank() == middleDeck.get(0).getRank();
		return false;
	}
	
	public boolean sandwich()
	{
		if(middleDeck.size() > 1)
			return middleDeck.peek().getRank() == middleDeck.get(middleDeck.size() - 3).getRank();
		return false;
	}
	
	public Texture cardImage(Card card)
	{
		Card newCard = new Card("heart", 4);
	    int rank = newCard.getRank();
	    String suit = newCard.getSuit();
	    card = newCard;
	    
	    if(card.getRank() == 1)
	    {
	        if(card.getSuit().equals("heart"))
	            return aceOfHearts;
	        if(card.getSuit().equals("diamond"))
	            return aceOfDiamonds;
	        if(card.getSuit().equals("club"))
	            return aceOfClubs;
	        if(card.getSuit().equals("spade"))
	            return aceOfSpades;
	    }
	    else if(card.getRank() == 2)
        {
            if(card.getSuit().equals("heart"))
                return twoOfHearts;
            if(card.getSuit().equals("diamond"))
                return twoOfDiamonds;
            if(card.getSuit().equals("club"))
                return twoOfClubs;
            if(card.getSuit().equals("spade"))
                return twoOfSpades;
        }
	    else if(card.getRank() == 3)
        {
            if(card.getSuit().equals("heart"))
                return threeOfHearts;
            if(card.getSuit().equals("diamond"))
                return threeOfDiamonds;
            if(card.getSuit().equals("club"))
                return threeOfClubs;
            if(card.getSuit().equals("spade"))
                return threeOfSpades;
        }
	    else if(card.getRank() == 4)
        {
            if(card.getSuit().equals("heart"))
                return fourOfHearts;
            if(card.getSuit().equals("diamond"))
                return fourOfDiamonds;
            if(card.getSuit().equals("club"))
                return fourOfClubs;
            if(card.getSuit().equals("spade"))
                return fourOfSpades;
        }
	    else if(card.getRank() == 5)
        {
            if(card.getSuit().equals("heart"))
                return fiveOfHearts;
            if(card.getSuit().equals("diamond"))
                return fiveOfDiamonds;
            if(card.getSuit().equals("club"))
                return fiveOfClubs;
            if(card.getSuit().equals("spade"))
                return fiveOfSpades;
        }
	    else if(card.getRank() == 6)
        {
            if(card.getSuit().equals("heart"))
                return sixOfHearts;
            if(card.getSuit().equals("diamond"))
                return sixOfDiamonds;
            if(card.getSuit().equals("club"))
                return sixOfClubs;
            if(card.getSuit().equals("spade"))
                return sixOfSpades;
        }
	    else if(card.getRank() == 7)
        {
            if(card.getSuit().equals("heart"))
                return sevenOfHearts;
            if(card.getSuit().equals("diamond"))
                return sevenOfDiamonds;
            if(card.getSuit().equals("club"))
                return sevenOfClubs;
            if(card.getSuit().equals("spade"))
                return sevenOfSpades;
        }
	    else if(card.getRank() == 8)
        {
            if(card.getSuit().equals("heart"))
                return eightOfHearts;
            if(card.getSuit().equals("diamond"))
                return eightOfDiamonds;
            if(card.getSuit().equals("club"))
                return eightOfClubs;
            if(card.getSuit().equals("spade"))
                return eightOfSpades;
        }
	    else if(card.getRank() == 9)
        {
            if(card.getSuit().equals("heart"))
                return nineOfHearts;
            if(card.getSuit().equals("diamond"))
                return nineOfDiamonds;
            if(card.getSuit().equals("club"))
                return nineOfClubs;
            if(card.getSuit().equals("spade"))
                return nineOfSpades;
        }
	    else if(card.getRank() == 10)
        {
            if(card.getSuit().equals("heart"))
                return tenOfHearts;
            if(card.getSuit().equals("diamond"))
                return tenOfDiamonds;
            if(card.getSuit().equals("club"))
                return tenOfClubs;
            if(card.getSuit().equals("spade"))
                return tenOfSpades;
        }
	    else if(card.getRank() == 11)
        {
            if(card.getSuit().equals("heart"))
                return jackOfHearts;
            if(card.getSuit().equals("diamond"))
                return jackOfDiamonds;
            if(card.getSuit().equals("club"))
                return jackOfClubs;
            if(card.getSuit().equals("spade"))
                return jackOfSpades;
        }
	    else if(card.getRank() == 12)
        {
            if(card.getSuit().equals("heart"))
                return queenOfHearts;
            if(card.getSuit().equals("diamond"))
                return queenOfDiamonds;
            if(card.getSuit().equals("club"))
                return queenOfClubs;
            if(card.getSuit().equals("spade"))
                return queenOfSpades;
        }
	    else if(card.getRank() == 13)
        {
            if(card.getSuit().equals("heart"))
                return kingOfHearts;
            if(card.getSuit().equals("diamond"))
                return kingOfDiamonds;
            if(card.getSuit().equals("club"))
                return kingOfClubs;
            if(card.getSuit().equals("spade"))
                return kingOfSpades;
        }
	    return null; 
	}
	
	public Texture numberTexture(int number)
	{
	switch (number)
	{
    	case 0:
    	    return zero;
    	case 1:
    	    return one;
    	case 2:
    	    return two;
    	case 3:
    	    return three;
    	case 4:
    	    return four;
    	case 5:
    	    return five;
    	case 6:
    	    return six;
    	case 7:
    	    return seven;
    	case 8:
    	    return eight;
    	case 9:
    	    return nine;
    	case 10:
    	    return ten;
    	case 11:
    	    return eleven;
    	case 12:
    	    return twelve;
    	case 13:
    	    return thirteen;
    	case 14:
    	    return fourteen;
    	case 15:
    	    return fifteen;
    	case 16:
    	    return sixteen;
    	case 17:
    	    return seventeen;
    	case 18:
    	    return eighteen;
    	case 19:
    	    return nineteen;
    	case 20:
    	    return twenty;
    	case 21:
    	    return twentyOne;
    	case 22:
    	    return twentyTwo;
    	case 23:
    	    return twentyThree;
    	case 24:
    	    return twentyFour;
    	case 25:
    	    return twentyFive;
    	case 26:
    	    return twentySix;
    	case 27:
    	    return twentySeven;
    	case 28:
    	    return twentyEight;
    	case 29:
    	    return twentyNine;
    	case 30:
    	    return thirty;
    	case 31:
    	    return thirtyOne;
    	case 32:
    	    return thirtyTwo;
    	case 33:
    	    return thirtyThree;
    	case 34:
    	    return thirtyFour;
    	case 35:
    	    return thirtyFive;
    	case 36:
    	    return thirtySix;
    	case 37:
    	    return thirtySeven;
    	case 38:
    	    return thirtyEight;
    	case 39:
    	    return thirtyNine;
    	case 40:
    	    return forty;
    	case 41:
    	    return fortyOne;
    	case 42:
    	    return fortyTwo;
    	case 43:
    	    return fortyThree;
    	case 44:
    	    return fortyFour;
    	case 45:
    	    return fortyFive;
    	case 46:
    	    return fortySix;
    	case 47:
    	    return fortySeven;
    	case 48:
    	    return fortyEight;
    	case 49:
    	    return fortyNine;
    	case 50:
    	    return fifty;
    	case 51:
    	    return fiftyOne;
    	case 52:
    	    return fiftyTwo;
    	default:
    	    return null;
	}
	}
}
