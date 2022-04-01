package com.example.taipeizookotlin.textviewSet

import android.content.Context
import android.graphics.LinearGradient
import android.graphics.Matrix
import android.graphics.Paint
import android.graphics.Shader
import android.text.TextPaint
import android.text.style.CharacterStyle
import android.text.style.UpdateAppearance
import com.example.textviewdesign.R


class AnimatedColorSpan(mContext: Context) : CharacterStyle(),
    UpdateAppearance {
    private val colors: IntArray = mContext.resources.getIntArray(R.array.rainbow)
    private var shader: Shader? = null
    private val matrix: Matrix = Matrix()
    var translateXPercentage = 0f

    override fun updateDrawState(paint: TextPaint) {
        paint.style = Paint.Style.FILL
        val width = paint.textSize * colors.size
        if (shader == null) {
            shader = LinearGradient(
                0f, 0f, 0f, width, colors, null,
                Shader.TileMode.MIRROR
            )
        }
        val iShader = shader
        if( iShader != null) {
            matrix.reset()
            matrix.setRotate(90f)
            matrix.postTranslate(width * translateXPercentage, 0f)
            iShader.setLocalMatrix(matrix)
            paint.shader = iShader
        }
    }

}