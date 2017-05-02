import java.io.File;
import java.util.*;


public class Factory implements IFactory
{

	private int h1 = 0;
	private int h2 = 0;
	private int e1 = 0;
	private int e2 = 0;
	
  private static IFactory m_instance;
  public static IFactory getInstance()
  {
    if (m_instance == null)
      m_instance = new Factory();
    return m_instance;
  }
  private Factory() 
  {
      try
      {
          String name = "";
          Scanner f = new Scanner(new File("hero.txt"));
          if (f.hasNextLine())
              name = f.nextLine().trim();
 

          String enemy = "";
          Scanner z = new Scanner(new File("enemy.txt"));
          if (z.hasNextLine())
              enemy = z.nextLine().trim();
          

          
          if(name.equals("Hero1"))
          {
        	  h1 = 1;
          }
          
          if(name.equals("Hero2"))
          {
        	  h1 = 2;
          }
          
          if(enemy.equals("Alien"))
          {
        	  e1 = 1;
          }
          
          if(enemy.equals("Monster"))
          {
        	  e1 = 2;
          }

      }
      catch (Exception e)
      {
          throw new Error("Unable to load file");
      }
  }

  @Override
  public IGameObject createEnemy(int x, int y, int w, int h, int dX, int dY)
  {
	  IGameObject enemy = null;
		int enemy1 = e1;
		int enemy2 = e2;
try
	{

	  if(enemy1 == 1)
	  {
		  enemy = new Alien(x, y, w, h, dX, dY);
	  }
	  
	  if(enemy1 == 2)
	  {
		  enemy = new Monster(x, y, w, h, dX, dY);
	  }
	  
	return enemy;
	
    }
    catch (Exception e)
    {
        throw new Error("Unable to load file");
    }
	

//	  
  }

  @Override
  public IGameObject createHero(int x, int y, int w, int h, int dX, int dY)
  {
	  IGameObject hero = null;
		int hero1 = h1;
		int hero2 = h2;
		
	  if(hero1 == 1)
	  {
		  hero = new Hero2(x, y, w, h, dX, dY);
	  }
	  
	  if(hero1 == 2)
	  {
		  hero = new Hero(x, y, w, h, dX, dY);
	  }

	return hero;
	  
  }
      

  @Override
  public IGameView createMainView(List<IGameObject> objects)
  {
    return new GameView(objects);
  }

  @Override
  public IGameView createStatusView(List<IGameObject> objects)
  {
    return new StatusView(objects);
  }

  @Override
  public IGameController createController(int interval, List<IGameObject> objects, List<IGameView> views)
  {
    return new GameController(interval, objects, views);
  }
}
