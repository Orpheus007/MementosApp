package com.gpg.mementos.dialogs

/*class QrScreen : DialogFragment(), EasyPermissions.PermissionCallbacks {

    private var mScannerView: ZXingScannerView? = null
    lateinit var binding: QrScreenBinding


    override fun onPermissionsDenied(requestCode: Int, perms: MutableList<String>) {
        overLord.launchEvent(OverLordEvents.Toasty(resources.getString(R.string.permissionDenied), com.gpg.jokerMerchant.utils.Toasty.Warning, true, es.dmoral.toasty.Toasty.LENGTH_LONG))
    }

    override fun onPermissionsGranted(requestCode: Int, perms: MutableList<String>) {
        if (requestCode == 999) {
            mScannerView?.startCamera()
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        EasyPermissions.onRequestPermissionsResult(999, permissions, grantResults, this)
    }

    companion object {
        lateinit var vModel: GenerateCartViewModel
        lateinit var overLord: OverLordViewModel
        fun newInstance(vModel: GenerateCartViewModel, overLord: OverLordViewModel): QrScreen {
            this.overLord = overLord
            this.vModel = vModel

            return QrScreen()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.qr_screen, container, false)

        binding = QrScreenBinding.bind(view)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mScannerView?.startCamera()

        if (!EasyPermissions.hasPermissions(activity!!, Manifest.permission.CAMERA)) {
            EasyPermissions
                .requestPermissions(
                    this@QrScreen, resources.getString(R.string.accessToCamera), 999,
                    Manifest.permission.CAMERA
                )
        }

        binding.appCompatImageButton.setOnClickListener {
            this.dismiss()
        }

        binding.flashLightCheckbox.setOnCheckedChangeListener { _, isChecked -> mScannerView?.flash = isChecked }
        //-----------------------------------------

        mScannerView = object : ZXingScannerView(this.context) {
            override fun createViewFinderView(context: Context): IViewFinder {
                return CustomViewFinderView(context)
            }
        }
        binding.contentFrame.addView(mScannerView)
        if (savedInstanceState == null) {
            mScannerView?.setResultHandler(vModel)
            mScannerView?.setAutoFocus(true)
        }

    }

    override fun onResume() {
        super.onResume()
        mScannerView?.setResultHandler(vModel)
        mScannerView?.startCamera()
    }

    override fun onPause() {
        super.onPause()
        mScannerView?.stopCamera()
    }

    override fun onDestroy() {
        super.onDestroy()
        mScannerView = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NORMAL, R.style.fullScreenDialogue)
    }

    class CustomViewFinderView : ViewFinderView {
        private val paint = Paint()

        constructor(context: Context) : super(context) {
            init()
        }

        constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
            init()
        }

        private fun init() {
            paint.color = Color.MAGENTA
            paint.isAntiAlias = true
            val textPixelSize = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_SP,
                TRADE_MARK_TEXT_SIZE_SP.toFloat(), resources.displayMetrics
            )
            paint.textSize = textPixelSize
            setSquareViewFinder(true)
        }

        override fun onDraw(canvas: Canvas) {
            super.onDraw(canvas)
            drawTradeMark(canvas)
        }

        private fun drawTradeMark(canvas: Canvas) {
            val framingRect = framingRect
            val tradeMarkTop: Float
            val tradeMarkLeft: Float
            if (framingRect != null) {
                tradeMarkTop = framingRect.bottom.toFloat() + paint.textSize + 10f
                tradeMarkLeft = framingRect.left.toFloat()
            } else {
                tradeMarkTop = 10f
                tradeMarkLeft = canvas.height.toFloat() - paint.textSize - 10f
            }
            canvas.drawText(TRADE_MARK_TEXT, tradeMarkLeft, tradeMarkTop, paint)
        }

        companion object {
            const val TRADE_MARK_TEXT = ""
            const val TRADE_MARK_TEXT_SIZE_SP = 40
        }
    }

}*/