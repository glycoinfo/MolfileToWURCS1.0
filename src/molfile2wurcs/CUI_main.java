package molfile2wurcs;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * CTfileを読み込みWURCSに変換、標準出力にIDとWURCSを出力
 * @author KenichiTanaka
 * @author IssakuYamada
 * based on MolfileToWURCS_20130416_1_CIP_after_speed_up
 */
public class CUI_main {
	//----------------------------
	// Public method
	//----------------------------
	public static void main(final String[] args) {
		try {
			Date date = new Date();
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS");
			System.setOut(new java.io.PrintStream(new java.io.FileOutputStream(df.format(date) + "_WURCS_v1.0.txt", false)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Parameter parameter = new Parameter(args, false);
		for(CTFile ctfile : parameter.ctfiles){
			ctfile.importV2000(parameter.m_ID, parameter.m_minNOS, parameter.m_minO, parameter.m_minBackboneLength, parameter.m_maxBackboneLength, parameter.m_sdfileOutput, null);
		}
	}
}
