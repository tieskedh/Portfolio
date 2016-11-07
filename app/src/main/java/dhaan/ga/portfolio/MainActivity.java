package dhaan.ga.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMovieProject;
    private Button btnCapstone;
    private Button btnHawk;
    private Button btnBuildItBigger;
    private Button btnMaterial;
    private Button btnUbiquitous;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMovieProject = (Button) findViewById(R.id.btnMovieProject);
        btnMovieProject.setOnClickListener(this);

        btnHawk = (Button) findViewById(R.id.btnHawk);
        btnHawk.setOnClickListener(this);

        btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        btnBuildItBigger.setOnClickListener(this);

        btnMaterial = (Button) findViewById(R.id.btnMaterial);
        btnMaterial.setOnClickListener(this);

        btnUbiquitous = (Button) findViewById(R.id.btnUbiquitous);
        btnUbiquitous.setOnClickListener(this);

        btnCapstone = (Button) findViewById(R.id.btnCapstone);
        btnCapstone.setOnClickListener(this);


    }

    public void onClick(View view) {
        String text = "This button will launch: ";
        switch (view.getId()) {
            case R.id.btnBuildItBigger:
                text = text+getString(R.string.build_it_bigger);
                break;
            case R.id.btnCapstone:
                text = text+getString(R.string.my_capstone);
                break;
            case R.id.btnHawk:
                text = text+getString(R.string.stock_hawk);
                break;
            case R.id.btnMaterial:
                text = text+getString(R.string.make_your_app_material);
                break;
            case R.id.btnMovieProject:
                text = text+getString(R.string.popular_movies);
                break;
            case R.id.btnUbiquitous:
                text = text+getString(R.string.go_ubiquitous);
                break;
            default:
                text = "This button is not implemented yet";
                break;
        }
        Toast.makeText(this, text, LENGTH_LONG).show();
    }
}
