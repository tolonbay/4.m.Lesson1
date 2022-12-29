package com.example.a4_mlesson1.ui.board

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a4_mlesson1.R
import com.example.a4_mlesson1.base.BaseFragment
import com.example.a4_mlesson1.databinding.FragmentOnboardBinding

class OnboardFragment : BaseFragment<FragmentOnboardBinding>(FragmentOnboardBinding::inflate),BoardAdapter.OpenListener {
    private lateinit var adapter: BoardAdapter

    override fun setupUI() {
        adapter = BoardAdapter(this)
         binding?.boardPager?.adapter = adapter

    }

    override fun open() {
        controller.navigate(R.id.noteFragment)
    }
}
