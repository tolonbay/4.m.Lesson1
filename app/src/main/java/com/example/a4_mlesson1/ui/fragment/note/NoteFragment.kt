package com.example.a4_mlesson1.ui.fragment.note

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a4_mlesson1.R
import com.example.a4_mlesson1.base.BaseFragment
import com.example.a4_mlesson1.databinding.FragmentNoteBinding

class NoteFragment : BaseFragment<FragmentNoteBinding>(FragmentNoteBinding::inflate) {
    private lateinit var adapter: NoteAdapter
    override fun setupUI() {
        adapter = NoteAdapter()
        binding.rvNote.adapter = adapter
        binding.btnAddNote.setOnClickListener{
            controller.navigate(R.id.addnoteFragment)
        }

    }

    override fun setupObserver() {
        super.setupObserver()
    }

}