import lejos.nxt.remote.NXTCommand;
import lejos.pc.comm.NXTComm;
import lejos.pc.comm.NXTCommException;
import lejos.pc.comm.NXTCommFactory;
import lejos.pc.comm.NXTInfo;

/**
 * Created by noah on 6/8/2017.
 */
public class ConnectionTest {
    public static void main(String[] args) {
        NXTInfo nxtInfo = null;
        try {
            nxtInfo = NXTCommFactory.createNXTComm(NXTCommFactory.USB).search("8528-A")[0];
        } catch (NXTCommException e) {
            e.printStackTrace();
        }

        NXTComm nxtComm;
        NXTCommand nxtCommand;
        try {
            nxtComm = NXTCommFactory.createNXTComm(NXTCommFactory.USB);
            nxtCommand = new NXTCommand(nxtComm);
            nxtComm.open(nxtInfo);
            //nxtCommand[i].setNXTComm(nxtComm[i]);
        } catch (NXTCommException e) {
            e.printStackTrace();
        }
    }
}
