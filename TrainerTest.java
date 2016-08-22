import static org.junit.Assert.assertEquals;
import org.junit.*;

public class TrainerTest{
  Trainer trainer;
  Pokemon pokemon;

  @Before 
  public void before() {
    trainer = new Trainer("Red");
    pokemon = new Pokemon();
  }

  @Test
  public void hasName(){
    assertEquals("Red", trainer.getName()); 
  }

  @Test
  public void pokeballsStartEmpty(){
    assertEquals(0, trainer.pokemonCount());
  }

  @Test
  public void canCatchPokemon(){
    trainer.caught(pokemon);
    assertEquals(1, trainer.pokemonCount());
  }

  @Test
  public void pokeballsAreFull(){
    for(int i = 0; i <= 5; i++){
      trainer.caught(pokemon);
    }
      assertEquals(true, trainer.pokeballsFull());
  }

  @Test
  public void pokeballsNotFull(){
    for(int i = 0; i < 5; i++){
      trainer.caught(pokemon);
    }
      assertEquals(false, trainer.pokeballsFull());
  }

  @Test
  public void cannotCatchPokemonWhenPokeballsFull(){
    for(int i = 0; i < 7 ; i++){
      trainer.caught(pokemon);
    }
    assertEquals(6, trainer.pokemonCount());
  }

}
