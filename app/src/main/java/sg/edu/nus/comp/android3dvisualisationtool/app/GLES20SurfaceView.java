package sg.edu.nus.comp.android3dvisualisationtool.app;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by panlong on 9/6/14.
 */
public class GLES20SurfaceView extends GLSurfaceView {
    public GLES20SurfaceView(Context context) {
        super(context);
        setRenderer(new GLES20Renderer());
    }
}