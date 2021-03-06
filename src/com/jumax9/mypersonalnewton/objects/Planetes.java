package com.jumax9.mypersonalnewton.objects;


public class Planetes {
	Planet planet;
	static String name;
	static double orbital_period, orbital_distance, phase, mass;

	public static Planet getPlanet(char planeta) {
		switch (planeta) {
			case '0':
				name = "El Sol";
				orbital_distance = 0;
				orbital_period = 9E9; //infinite
				phase = 0; //does not matter
				mass = 1f; // 1 solar masses
				break;
			case '1':
				name = "Mercurio";
				orbital_distance = 0.39528297E0;
				orbital_period = 87.96926E0;
				phase = 0.82444E0; //could be minus
				mass = 1.6607E-7;
				break;
			case '2':
				name = "Venus";
				orbital_distance = 0.72334858E0;
				orbital_period = 224.7008E0;
				phase = 0.552403E0; //could be minus
				mass = 2.4487E-6;
				break;
			case '3':
				name = "La luna";
				orbital_distance = 0; // special case
				orbital_period = 0;
				phase = 0;
				mass = 3.69587E-8;
				break;
			case '4':
				name = "Marte";
				orbital_distance = 1.53030994E0;
				orbital_period = 686.9796E0;
				phase = 0.465428E0;
				mass = 3.2282E-7;
				break;
			case '5':
				name = "Jupiter";
				orbital_distance = 5.21E0; // au
				orbital_period = 4333E0; // days
				phase = 0.929E0; // rad
				mass = 9.5458E-4; // solar masses
				break;
			case '6':
				name = "Saturno";
				orbital_distance = 9.551053E0;
				orbital_period = 10755.7E0;
				phase = 1.46335E0;
				mass = 2.859E-4;
				break;
			case '7':
				name = "Urano";
				orbital_distance = 1.921251222E1;
				orbital_period = 30687.153E0;
				phase = 2.97829;
				mass = 4.3564E-5;
				break;
			case '8':
				name = "Neptuno";
				orbital_distance = 3.007007178E1;
				orbital_period = 30687.153E0;
				phase = 2.66018;
				mass = 5.15028E-5;
				break;
			default:
				name = "ERROR";
				orbital_distance = 5.21E0;
				orbital_period = 4333E0;
				phase = 0.929E0;
				mass = 1.89813E27;
				break;		
		}
		return new Planet(name,orbital_distance,orbital_period,phase,mass);
	}
}
