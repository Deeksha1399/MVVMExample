package com.yml.retrofitexampleusingmvvm.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yml.retrofitexampleusingmvvm.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val postFragment = PostFragment()
        val usersFragment = UsersFragment()
        val commentsFragment = CommentsFragment()
        val todosFragment = TodosFragment()
        val categoriesFragment = CategoriesFragment()
        val productsFragment = ProductsFragment()
        val productCategoryFragment = ProductCategoryFragment()

        post_button.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frame_layout, postFragment)
                .addToBackStack(null).commit()
        }
        users_button.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frame_layout, usersFragment)
                .addToBackStack(null).commit()
        }
        comment_button.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frame_layout, commentsFragment)
                .addToBackStack(null).commit()
        }
        todos_button.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frame_layout, todosFragment)
                .addToBackStack(null).commit()
        }
        categories_button.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frame_layout, categoriesFragment)
                .addToBackStack(null).commit()
        }
        products_button.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frame_layout, productsFragment)
                .addToBackStack(null).commit()
        }
        productCategory_button.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frame_layout, productCategoryFragment)
                .addToBackStack(null).commit()
        }
    }
}