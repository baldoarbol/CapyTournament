package com.example.demo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TeamEntity {
	
	//atributos 
	@Id
	@Column(name="NOMBRE_EQUIPO", length=50, nullable=false, unique=true)
	private String nombre;
	
	//incluir info del capitan cuando cree jugador
	@Column(name="WINRATE", nullable=false, unique=false)
	private float winrate = 0;
	
	@Column(name="LEMA",length=140, nullable=true, unique=false)
	private String lema;
	
	@Column(name="VICTORIAS_EQUIPO", nullable=false, unique=false)
	private int victorias = 0;
	
	@Column(name="DERROTAS_EQUIPO", nullable=false, unique=false)
	private int derrotas = 0;
	
	@Column(name="KILL_STAT", nullable=false, unique=false)
	private int kills = 0;
	
	@Column(name="DEATHS_STAT", nullable=false, unique=false)
	private int deaths = 0;
	
	@Column(name="ASSIST_STAT", nullable=false, unique=false)
	private int assists = 0;
	
	//constructor
	protected TeamEntity() {}

	public TeamEntity(String nombre, float winrate, String lema, int victorias, int derrotas, int kills, int deaths, int assists) {
		this.nombre = nombre;
		this.winrate = winrate;
		this.lema = lema;
		this.victorias = victorias;
		this.derrotas = derrotas;
		this.kills = kills;
		this.deaths = deaths;
		this.assists = assists;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getWinrate() {
		return winrate;
	}

	public void setWinrate(float winrate) {
		this.winrate = winrate;
	}

	public String getLema() {
		return lema;
	}

	public void setLema(String lema) {
		this.lema = lema;
	}

	public int getVictorias() {
		return victorias;
	}

	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	};
	

}