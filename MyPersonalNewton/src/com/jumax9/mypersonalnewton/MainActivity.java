package com.jumax9.mypersonalnewton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends Activity implements OnClickListener {

	// EditText altitud, planeta;
	Spinner planetes;
	String planet;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button calcular = (Button) findViewById(R.id.calcular);
		calcular.setOnClickListener(this);

		planetes = (Spinner) findViewById(R.id.spinnerPlanets);

		// altitud = (EditText) findViewById(R.id.altitud);
		// planeta = (EditText) findViewById(R.id.planetaNum);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void goToCalcular() {
		planet = planetes.getSelectedItem().toString();
		Intent i = new Intent(this, Calculos.class);
		i.putExtra("MainActivity.planeta", planet);
		startActivity(i);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.calcular: // This is the only case as of now
				// altit = Float.parseFloat(altitud.getText().toString());
				// planet = planeta.getText().toString();
				planet = planetes.getSelectedItem().toString();
				Intent i = new Intent(this, Calculos.class);
				// i.putExtra("MainActivity.altitud", altit);
				i.putExtra("MainActivity.planeta", planet);
				startActivity(i);
				break;
		}
	}

}
