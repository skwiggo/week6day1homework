class Trainer {
  
  private String name;
  private Pokemon[] pokeball;

  public Trainer(String name){
    this.name = name;
    this.pokeball = new Pokemon[6];
  }
  
  public String getName(){
    return this.name;
  }

  public int pokemonCount(){
    int counter = 0;
    for(Pokemon pokemon : pokeball){
      if(pokemon != null){
        counter++;
      }
    }
    return counter;
  }

  public boolean pokeballsFull(){
    return pokemonCount() == pokeball.length;
  }

  public void caught(Pokemon pokemon){
    if(pokeballsFull()) return;
    int pokemonCount = pokemonCount();
    pokeball[pokemonCount] = pokemon;
  }

}
