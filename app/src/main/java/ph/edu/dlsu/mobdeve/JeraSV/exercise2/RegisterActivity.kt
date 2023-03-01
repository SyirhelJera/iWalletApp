package ph.edu.dlsu.mobdeve.JeraSV.exercise2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val submitButton = findViewById<Button>(R.id.SubmitButton)
        submitButton.setOnClickListener{

            val passwordET = findViewById<EditText>(R.id.Password)
            val cpasswordET = findViewById<EditText>(R.id.ConfirmPassword)
            val usernameET = findViewById<EditText>(R.id.Username)

            val username = usernameET.text.toString().trim()
            val password = passwordET.text.toString().trim()
            val cpassword = cpasswordET.text.toString().trim()

            val pasMinLength = 8;
            val userMinLength = 5;

            if ((password.length >= pasMinLength && password == cpassword) && username.length >= userMinLength){
                Toast.makeText(this, "Registered Successfully", Toast.LENGTH_SHORT).show()
                val Intent = Intent(this,MainActivity::class.java)
                startActivity(Intent)
            } else Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show()


        }

    }
}