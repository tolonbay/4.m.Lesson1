package com.example.a4_mlesson1.ui.fragment.note

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a4_mlesson1.databinding.ItemNoteBinding
import com.example.a4_mlesson1.model.NoteModel

class NoteAdapter: RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {
    private var list = ArrayList<NoteModel>()

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: ArrayList<NoteModel>){
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = NoteViewHolder(
        ItemNoteBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int  = list.size

    class NoteViewHolder(private val binding:ItemNoteBinding): RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: NoteModel) {
            binding.itemTvTitle.text = model.title
            binding.itemTvDes.text = model.description

        }

    }
}