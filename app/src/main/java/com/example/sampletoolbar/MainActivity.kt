package com.example.sampletoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean
    {
        menuInflater.inflate(R.menu.toolbar_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {
        when(item.itemId)
        {
            R.id.menu_persons_add -> Toast.makeText(this, "You Clicked on Add Contact", Toast.LENGTH_SHORT).show()
            R.id.menu_settings -> Toast.makeText(this, "You Clicked on Settings", Toast.LENGTH_SHORT).show()
            R.id.menu_favorite -> Toast.makeText(this, "You Clicked on Favorite", Toast.LENGTH_SHORT).show()
            R.id.menu_feedback -> Toast.makeText(this, "You Clicked on Feedback", Toast.LENGTH_SHORT).show()
            R.id.menu_close -> Toast.makeText(this, "You Clicked on Close", Toast.LENGTH_SHORT).show()
        }

        return true
    }
}