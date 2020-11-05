package com.lindronics.test1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.lindronics.test1.data.Data

class MainActivity : AppCompatActivity() {

    var data = Data()

    override fun onCreate(savedInstanceState: Bundle?) {
        val TAG = "MainActivity"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        var textField = findViewById<TextView>(R.id.textView)
        button.setOnClickListener {
            Log.d(TAG, "asdf");
            Toast.makeText(this, "Randomizing...", Toast.LENGTH_SHORT).show()
            textField.text = data.randomName()

        }
        findViewById<Button>(R.id.launchActivity).setOnClickListener {
            val intent = Intent(this, TestActivity::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.google).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.uk"))
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
//        menu?.getItem(0)?.isEnabled = false
//        menu?.getItem(0)?.isVisible = false
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_add -> {
                var taskEditText = EditText(this)
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Alert!")
                builder.setView(taskEditText)
                builder.setMessage("This is a test alert.")
                builder.setPositiveButton("Yes") { _, _ ->
                    val name = taskEditText.text.toString().trim()
                    data.addName(name)
                    Toast.makeText(this, "Added ${name}", Toast.LENGTH_SHORT).show()

                }
                builder.setNegativeButton("No", null)
//                builder.setNeutralButton("Neutral", null)
                builder.show()
                true
            }
            R.id.menu_remove -> {
                Toast.makeText(this, "Another text on click", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }
}