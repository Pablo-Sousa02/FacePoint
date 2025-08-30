import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;
import org.opencv.highgui.HighGui;

public class FaceRecognition {
    public static void main(String[] args) {
        // Carregar a biblioteca
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println("OpenCV carregado com sucesso!");

        // Abrir webcam
        VideoCapture camera = new VideoCapture(0);
        if (!camera.isOpened()) {
            System.out.println("Erro ao abrir a câmera!");
            return;
        }


        CascadeClassifier faceDetector = new CascadeClassifier("C:/Users/Pablo/IdeaProjects/FacePoint/lib/opencv/build/etc/haarcascades/haarcascade_frontalface_default.xml");

        Mat frame = new Mat();

        while (true) {
            if (camera.read(frame)) {
                // Converter para escala de cinza
                Mat gray = new Mat();
                Imgproc.cvtColor(frame, gray, Imgproc.COLOR_BGR2GRAY);

                // Detectar rostos
                MatOfRect faces = new MatOfRect();
                faceDetector.detectMultiScale(gray, faces);

                // Desenhar retângulos nos rostos detectados
                for (Rect rect : faces.toArray()) {
                    Imgproc.rectangle(frame, rect, new Scalar(0, 255, 0), 2);
                }

                // Mostrar a imagem
                HighGui.imshow("Detecção de Rosto", frame);

                // Sair se apertar ESC
                if (HighGui.waitKey(30) == 27) {
                    break;
                }
            }
        }

        camera.release();
        HighGui.destroyAllWindows();
    }
}
