package edu.np.ece.mapg.s10145449mpi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

	int myNumber = 9;
	EditText etNumber;
	TextView tvNumber;
	Button btGuess;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        etNumber = (EditText) this.findViewById(R.id.etNumber);
        tvNumber = (TextView) this.findViewById(R.id.TextView1);
        btGuess = (Button) this.findViewById(R.id.btGuess);
        btGuess.setOnClickListener(listener);
    }
    
	private View.OnClickListener listener = new View.OnClickListener() {
	
		@Override
		public void onClick(View v) {
			int num= Integer.parseInt(etNumber.getText().toString());
			if(num == myNumber){					
				Toast.makeText(getBaseContext(), "Bingo! Correct Number", Toast.LENGTH_SHORT).show();
				}
			else{
				Toast.makeText(getBaseContext(), "Try again!", Toast.LENGTH_SHORT).show();
				}
		}
	};


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
