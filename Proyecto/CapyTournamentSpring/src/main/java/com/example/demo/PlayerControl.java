package com.example.demo;
	import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.CommandLineRunner;
	import org.springframework.stereotype.Service;

	@Service
	public class PlayerControl implements CommandLineRunner {

	    @Autowired
	    private PlayerRepository repository;
	    public PlayerControl() {
	    }

	    public void newPlayer(String name) {
	        PlayerEntity newPlayer= new PlayerEntity(name);
	        repository.save(newPlayer);
	    }
	    
	    public void newPlayer(String name, String email, String password) {
	    	PlayerEntity newPlayer = new PlayerEntity(name, email, password);
	    	repository.save(newPlayer);
	    }
	    
	    public void newPlayer(String name, String email, String password, boolean isAdmin) {
	    	PlayerEntity newPlayer = new PlayerEntity(name, email, password, isAdmin);
	    	repository.save(newPlayer);
	    }
	    
	    public void newPlayer(PlayerEntity player) {
	    	repository.save(player);
	    }
	    
	    public List<PlayerEntity> findAllPlayers(){
	        List<PlayerEntity> playersList= repository.findAll();
	        return playersList;
	    }
	    
	    public void deletePlayerById(String id){
			repository.deleteById(id);
		}
	    
	    public Optional<PlayerEntity> findPlayerById(String id){
	    	return repository.findById(id);
	    }
	    
	    public void savePlayer(PlayerEntity player) {
	    	repository.save(player);
	    }

	    @Override
	    public void run(String... args) throws Exception {


	    }


	}
