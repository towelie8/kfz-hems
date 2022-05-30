package com.hems.kennzeichen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kennzeichen")
public class Kennzeichen {

	@Id
	@GeneratedValue
	private int id;
	@Column
	private String autokennzeichen;
	@Column
	private String stadt;
	@Column
	private String landkreis;
	@Column
	private String bundesland;

	public Kennzeichen() {

	}

	public Kennzeichen(String autokennzeichen, String stadt, String landkreis, String bundesland) {
		this.autokennzeichen = autokennzeichen;
		this.stadt = stadt;
		this.landkreis = landkreis;
		this.bundesland = bundesland;
	}
	
	@Override
	public String toString() {
		return String.format("Kennzeichen[id=%d, autokennzeichen='%s', stadt='%s', landkreis='%s', bundesland='%s']" , id, autokennzeichen, stadt, landkreis, bundesland);
	}

	public String getAutokennzeichen() {
		return autokennzeichen;
	}

	public void setAutokennzeichen(String autokennzeichen) {
		this.autokennzeichen = autokennzeichen;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public String getLandkreis() {
		return landkreis;
	}

	public void setLandkreis(String landkreis) {
		this.landkreis = landkreis;
	}

	public String getBundesland() {
		return bundesland;
	}

	public void setBundesland(String bundesland) {
		this.bundesland = bundesland;
	}

	public int getId() {
		return id;
	}
}
