function areYouPlayingBanjo(name) {
    if (name[0] == "R" ){
      console.log(name + " plays banjo")
    }
    else if (name[0] == "r"){
      console.log(name + " plays banjo")
    }
    else{
      console.log(name + " does not play banjo")
    }
    return name;
  }

  areYouPlayingBanjo("Adam")