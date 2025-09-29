package sk.upjs.paz;

import lombok.With;

@With
public record PomerPohlavi(
		int boys,
		int girls,
		int other) {

	public double pomerChlapci(){
		return (double) boys / (double) (boys + girls + other);
	}

	public double pomerDievcata() {
		return (double) girls / (double) (boys + girls + other);
	}
}
