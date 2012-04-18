package com.wordpress.hilfranjr.test;
import android.test.ActivityInstrumentationTestCase2;
import com.wordpress.hilfranjr.CadastroActivity;

//Joe Carvalho

public class CadastroTeste {

    public class CadastroActivityTest extends ActivityInstrumentationTestCase2<CadastroActivity> {

    public CadastroActivityTest() {
    super(“com.wordpress.hilfranjr”, CadastroActivity.class);
    }

    }
    
    @Override protected void setUp() throws Exception {
    super.setUp();
    setActivityInitialTouchMode(false);
    mActivity = getActivity();
    mMonitor = mIntrumentation.addMonitor(ResultActivity.class.getName(), null, false);
    e1 = (EditText) mActivity.findViewById(br.edu.cesar.R.id.editText1);
    e2 = (EditText) mActivity.findViewById(br.edu.cesar.R.id.editText2);
    bSomar = (Button) mActivity.findViewById(br.edu.cesar.R.id.btnSomar);
    bSubtrair = (Button) mActivity.findViewById(br.edu.cesar.R.id.btnSubtrair);
    bMultiplicar = (Button) mActivity.findViewById(br.edu.cesar.R.id.btnMultiplicar);
    bDividir = (Button) mActivity.findViewById(br.edu.cesar.R.id.btnDividir);

    }

}
