package mitofit.com.coderswag.Adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.widget.ImageViewCompat
import kotlinx.android.synthetic.main.cstrgory_list_item.view.*
import mitofit.com.coderswag.Model.Category
import mitofit.com.coderswag.R
import kotlin.coroutines.coroutineContext

class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {
    val context = context
    val categories = categories


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val holder: ViewHolder
        val categoryView: View
        if (convertView == null) {
            holder = ViewHolder()
            categoryView = LayoutInflater.from(context).inflate(R.layout.cstrgory_list_item, null)
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            categoryView.tag = holder
        }else{
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

            val category = categories[position]
            val resourceId =
                context.resources.getIdentifier(category.image, "drawable", context.packageName)
            holder.categoryImage?.setImageResource(resourceId)
            holder.categoryName?.text = category.title
            println(resourceId)


            return categoryView

        }

        override fun getItem(position: Int): Any {
            return categories[position]
        }

        override fun getItemId(position: Int): Long {
            return 0
        }

        override fun getCount(): Int {
            return categories.count()
        }

        private class ViewHolder {
            var categoryImage: ImageView? = null
            var categoryName: TextView? = null

        }

    }