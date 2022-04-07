package com.example.textviewdesign.textviewSet

import android.graphics.Canvas
import android.graphics.Paint
import android.os.Bundle
import android.text.Layout
import android.text.SpannableString
import android.text.TextUtils
import android.text.style.LeadingMarginSpan
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.textviewdesign.R
import com.example.textviewdesign.databinding.ArticletestBinding


class ArticleTest : AppCompatActivity() {

    private lateinit var mDataBinding: ArticletestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDataBinding = DataBindingUtil.setContentView(this, R.layout.articletest)
        initView()
    }


    private fun initView() {
        inputArticle()
    }


    private fun inputArticle() {

        val iiBullets = arrayOf(
            "1.",
            "2.",
            "3.",
            "4.",
            "5.",
            "6.",
            "7.",
            "8.",
            "a. ",
            "b. ",
            "c. ",
            "d. ",
            "e. ",
            "9.",
            "•",
            "•",
            "•",
            "•",
            "•",
            "a.",
            "b.",
            "c.",
            "d.",
            "e.",
            "f.",
            "g."
        )
        val iiItemContents = arrayOf(
            "推播通知服務」(以下簡稱本服務)提供「MMA金融交易網會員」及「大咖體驗會員」免費使用。",
            "當您登入使用此裝置時將視為您已經同意「啟用」您的推播通知服務，如欲停止推播通知，請自行於更多>設定>推播訊息>設定，「關閉」推播訊息服務。",
            "每個身份證字號僅可授權5台設備接收推播通知服務。",
            "每台設備僅可約定單一身分證字號，如已解除裝置約定或切換使用者以另一個身分證字號約定本裝置，本台裝置申請之推播服務將自動失效。",
            "推播通知服務受限於網路傳輸或其他因素影響，無法保證一定送達，實際交易結果請以往來明細或該筆交易查詢功能為準。",
            "推播通知服務僅為提醒之用，若您因不明原因未收到推播提醒，請您直接使用該筆交易之查詢功能資料為準，並請自行確認該設備推播設定已開啟且系統、網路連線正常，用戶不得以本行未發送推播通知、未即時發送推播通知或不明原因未收受消費推播通知，或推播通知內容有誤，而藉此請求損害賠償或否認該交易存在。",
            "本服務提供查詢最近三個月內收到的50筆訊息。",
            "推播訊息類型如下",
            "優惠/公告訊息：不定期公告本行優惠活動、系統維護、權益變更等訊息通知。",
            "繳費通知：包含待繳帳單提醒通知、繳費交易成功通知及繳費退款通知。",
            "信用卡通知：包含信用卡消費通知、核卡通知及繳卡費入帳通知。",
            "裝置通知：包含行動裝置綁定與解除、登入錯誤通知及快速登入設定通知。",
            "活動通知：包含活動中獎或其他個人活動通知。",
            "信用卡消費通知，說明及注意事項：",
            "本行預設提供(正卡或附件)持卡人不限金額消費通知。",
            "當關閉推播服務或您已設定不接收推播之時段，於關閉或不接收推播之時段內進行信用卡交易則不會發送消費通知推播提醒。",
            "關閉大咖DACARD App信用卡消費通知推播提醒後，如您原已有設定接收信用卡消費簡訊、LINE官方帳號、行動銀行或DAWHO APP消費推播通知，於此關閉本通知後仍會依原設定收到消費簡訊、LINE官方帳號、行動銀行或DAWHO APP之消費推播通知。",
            "本項通知僅為提醒用途，用戶不得以本行未發送推播通知、未即時發送推播通知或不明原因未收受消費推播通知，或推播通知內容有誤，而藉此請求損害賠償或否認該交易存在。",
            "下列消費情形「不會」提供信用卡消費通知，包括但不限於：",
            "悠遊卡及一卡通自動加值、ATM預借現金、賭場消費、保費交易。",
            "若因系統等因素（如：飛機上之離線交易）致本行無法即時得知消費交易時。",
            "沖銷交易、拒絕交易、取消交易、授權金額小於等於零之交易。",
            "人工授權、非即時交易及預先授權之交易(例如飯店…等)。",
            "部分交易因商店處理方式不同，將無法提供即時的刷卡通知，如信用卡代扣繳費用、稅款、郵購、保險、人工授權及週期性固定繳納之會費等交易或消費時間您所看到之消費時間不同(如時間差超過一小時之交易)。",
            "豐市集紅利網交易(部分特店)。",
            "代行授權(國際組織代替銀行授權交易)。"
        )

        val iBullets =
            arrayOf("1.", "2.", "3.", "4.", "5.", "6.", "7.", "8.")
        val iItemContents = arrayOf(
            "推播通知服務」(以下簡稱本服務)提供「MMA金融交易網會員」及「大咖體驗會員」免費使用。",
            "當您登入使用此裝置時將視為您已經同意「啟用」您的推播通知服務，如欲停止推播通知，請自行於更多>設定>推播訊息>設定，「關閉」推播訊息服務。",
            "每個身份證字號僅可授權5台設備接收推播通知服務。",
            "每台設備僅可約定單一身分證字號，如已解除裝置約定或切換使用者以另一個身分證字號約定本裝置，本台裝置申請之推播服務將自動失效。",
            "推播通知服務受限於網路傳輸或其他因素影響，無法保證一定送達，實際交易結果請以往來明細或該筆交易查詢功能為準。",
            "推播通知服務僅為提醒之用，若您因不明原因未收到推播提醒，請您直接使用該筆交易之查詢功能資料為準，並請自行確認該設備推播設定已開啟且系統、網路連線正常，用戶不得以本行未發送推播通知、未即時發送推播通知或不明原因未收受消費推播通知，或推播通知內容有誤，而藉此請求損害賠償或否認該交易存在。",
            "本服務提供查詢最近三個月內收到的50筆訊息。",
            "推播訊息類型如下"
        )

        val iBulletsTwo =
            arrayOf("a.", "b.", "c.", "d.", "e.")
        val iItemContentsTwo = arrayOf(
            "優惠/公告訊息：不定期公告本行優惠活動、系統維護、權益變更等訊息通知。",
            "繳費通知：包含待繳帳單提醒通知、繳費交易成功通知及繳費退款通知。",
            "信用卡通知：包含信用卡消費通知、核卡通知及繳卡費入帳通知。",
            "裝置通知：包含行動裝置綁定與解除、登入錯誤通知及快速登入設定通知。",
            "活動通知：包含活動中獎或其他個人活動通知。",
            "信用卡消費通知，說明及注意事項："
        )
        val iBulletsThree =
            arrayOf("9.")
        val iItemContentsThree = arrayOf("信用卡消費通知，說明及注意事項：")

        val iBulletsFour =
            arrayOf("•", "•", "•", "•", "•")
        val iItemContentsFour = arrayOf(
            "本行預設提供(正卡或附件)持卡人不限金額消費通知。",
            "當關閉推播服務或您已設定不接收推播之時段，於關閉或不接收推播之時段內進行信用卡交易則不會發送消費通知推播提醒。",
            "關閉大咖DACARD App信用卡消費通知推播提醒後，如您原已有設定接收信用卡消費簡訊、LINE官方帳號、行動銀行或DAWHO APP消費推播通知，於此關閉本通知後仍會依原設定收到消費簡訊、LINE官方帳號、行動銀行或DAWHO APP之消費推播通知。",
            "本項通知僅為提醒用途，用戶不得以本行未發送推播通知、未即時發送推播通知或不明原因未收受消費推播通知，或推播通知內容有誤，而藉此請求損害賠償或否認該交易存在。",
            "下列消費情形「不會」提供信用卡消費通知，包括但不限於："
        )

        val iBulletsFive =
            arrayOf("a.", "b.", "c.", "d.", "e.", "f.", "g.")
        val iItemContentsFive = arrayOf(
            "悠遊卡及一卡通自動加值、ATM預借現金、賭場消費、保費交易。",
            "若因系統等因素（如：飛機上之離線交易）致本行無法即時得知消費交易時。",
            "沖銷交易、拒絕交易、取消交易、授權金額小於等於零之交易。",
            "人工授權、非即時交易及預先授權之交易(例如飯店…等)。",
            "部分交易因商店處理方式不同，將無法提供即時的刷卡通知，如信用卡代扣繳費用、稅款、郵購、保險、人工授權及週期性固定繳納之會費等交易或消費時間您所看到之消費時間不同(如時間差超過一小時之交易)。",
            "豐市集紅利網交易(部分特店)。",
            "代行授權(國際組織代替銀行授權交易)。"
        )

        var iCharSequence: CharSequence = ""
        iCharSequence = funLeadingMarginSpan(iBullets, iItemContents, iCharSequence, 1)
        iCharSequence = funLeadingMarginSpan(iBulletsTwo, iItemContentsTwo, iCharSequence, 2)
        iCharSequence = funLeadingMarginSpan(iBulletsThree, iItemContentsThree, iCharSequence, 1)
        iCharSequence = funLeadingMarginSpan(iBulletsFour, iItemContentsFour, iCharSequence, 2)
        iCharSequence = funLeadingMarginSpan(iBulletsFive, iItemContentsFive, iCharSequence, 3)

        mDataBinding.textView.textSize = 13F
        mDataBinding.textView.text = iCharSequence
        // funLeadingMarginSpan(iiBullets, iiItemContents)

    }

    private fun funLeadingMarginSpan(
        iBullets: Array<String>,
        iItemContents: Array<String>,
        iCharSequence: CharSequence,
        pLevel: Int
    ): CharSequence {
        var allText = iCharSequence
        val iDistance = 50
        val iTitleNextContents = pLevel * iDistance
        val iTitleIndex = iTitleNextContents - iDistance



        for (i in iBullets.indices) {
            val aBullet = iBullets[i]
            val t = iItemContents[i].trim()
            val spannableString = SpannableString(t + "\n")
            // 註意此處的換行, 如果沒有換行符, 則系統當做只有一個項目處理

            spannableString.setSpan(object : LeadingMarginSpan {
                override fun getLeadingMargin(first: Boolean): Int {
                    // 項目符號和正文的縮進距離, 單位 px
                    // 我們可以根據 first 來改變第1行和其余行的縮進距離
//                    }
                    return iTitleNextContents
                }


                override fun drawLeadingMargin(
                    c: Canvas,
                    p: Paint,
                    x: Int,
                    dir: Int,
                    top: Int,
                    baseline: Int,
                    bottom: Int,
                    text: CharSequence?,
                    start: Int,
                    end: Int,
                    first: Boolean,
                    layout: Layout?
                ) {

                    // 只對第1行文本添加項添加符號
                    if (first) {
                        c.drawText(aBullet, iTitleIndex.toFloat(), bottom - p.descent(), p)
                    }
                }
            }, 0, t.length, 0)
            allText = TextUtils.concat(allText, spannableString)
        }
        return allText
    }
}