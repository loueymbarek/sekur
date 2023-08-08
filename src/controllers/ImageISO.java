package controllers;

import models.Fuseau_horaire;
import models.type_clavier;


	public class ImageISO {
	    private String os;
	    private String usb;
	    private String ssid;
	    private String mdpwifi;
	    private boolean reglagesLocaux;
	    private Fuseau_horaire fuseauHoraire;
	    private type_clavier typeClavier;
	    private boolean osChecked;
	    private boolean cameraChecked;
	    private boolean microChecked;
	    private boolean projecteurChecked;
	    private boolean hautparleurChecked;
	    private boolean buzzeurChecked;
	    private boolean hiddenChecked;
	    private boolean activerSshChecked;
	    private double progressValue;

	    // Constructeurs
	    public ImageISO() {};
	    
	    public ImageISO(String os, String usb, String ssid, String mdpwifi, boolean reglagesLocaux,
	                    Fuseau_horaire fuseauHoraire, type_clavier typeClavier, boolean osChecked,
	                    boolean cameraChecked, boolean microChecked, boolean projecteurChecked,
	                    boolean hautparleurChecked, boolean buzzeurChecked, boolean hiddenChecked,
	                    boolean activerSshChecked,double progressValue) {
	        this.os = os;
	        this.usb = usb;
	        this.ssid = ssid;
	        this.mdpwifi = mdpwifi;
	        this.reglagesLocaux = reglagesLocaux;
	        this.fuseauHoraire = fuseauHoraire;
	        this.typeClavier = typeClavier;
	        this.osChecked = osChecked;
	        this.cameraChecked = cameraChecked;
	        this.microChecked = microChecked;
	        this.projecteurChecked = projecteurChecked;
	        this.hautparleurChecked = hautparleurChecked;
	        this.buzzeurChecked = buzzeurChecked;
	        this.hiddenChecked = hiddenChecked;
	        this.activerSshChecked = activerSshChecked;
	        this.progressValue = progressValue;
	    }

		public String getOs() {
			return os;
		}

		public void setOs(String os) {
			this.os = os;
		}

		public String getUsb() {
			return usb;
		}

		public void setUsb(String usb) {
			this.usb = usb;
		}

		public String getSsid() {
			return ssid;
		}

		public void setSsid(String ssid) {
			this.ssid = ssid;
		}

		public String getMdpwifi() {
			return mdpwifi;
		}

		public void setMdpwifi(String mdpwifi) {
			this.mdpwifi = mdpwifi;
		}

		public boolean isReglagesLocaux() {
			return reglagesLocaux;
		}

		public void setReglagesLocaux(boolean reglagesLocaux) {
			this.reglagesLocaux = reglagesLocaux;
		}

		public Fuseau_horaire getFuseauHoraire() {
			return fuseauHoraire;
		}

		public void setFuseauHoraire(Fuseau_horaire fuseauHoraire) {
			this.fuseauHoraire = fuseauHoraire;
		}

		public type_clavier getTypeClavier() {
			return typeClavier;
		}

		public void setTypeClavier(type_clavier typeClavier) {
			this.typeClavier = typeClavier;
		}

		public boolean isOsChecked() {
			return osChecked;
		}

		public void setOsChecked(boolean osChecked) {
			this.osChecked = osChecked;
		}

		public boolean isCameraChecked() {
			return cameraChecked;
		}

		public void setCameraChecked(boolean cameraChecked) {
			this.cameraChecked = cameraChecked;
		}

		public boolean isMicroChecked() {
			return microChecked;
		}

		public void setMicroChecked(boolean microChecked) {
			this.microChecked = microChecked;
		}

		public boolean isProjecteurChecked() {
			return projecteurChecked;
		}

		public void setProjecteurChecked(boolean projecteurChecked) {
			this.projecteurChecked = projecteurChecked;
		}

		public boolean isHautparleurChecked() {
			return hautparleurChecked;
		}

		public void setHautparleurChecked(boolean hautparleurChecked) {
			this.hautparleurChecked = hautparleurChecked;
		}

		public boolean isBuzzeurChecked() {
			return buzzeurChecked;
		}

		public void setBuzzeurChecked(boolean buzzeurChecked) {
			this.buzzeurChecked = buzzeurChecked;
		}

		public boolean isHiddenChecked() {
			return hiddenChecked;
		}

		public void setHiddenChecked(boolean hiddenChecked) {
			this.hiddenChecked = hiddenChecked;
		}

		public boolean isActiverSshChecked() {
			return activerSshChecked;
		}

		public void setActiverSshChecked(boolean activerSshChecked) {
			this.activerSshChecked = activerSshChecked;
		}

		public double getProgressValue() {
			return progressValue;
		}

		public void setProgressValue(double progressValue) {
			this.progressValue = progressValue;
		}

		@Override
		public String toString() {
			return "ImageISO [os=" + os + ", usb=" + usb + ", ssid=" + ssid + ", mdpwifi=" + mdpwifi
					+ ", reglagesLocaux=" + reglagesLocaux + ", fuseauHoraire=" + fuseauHoraire + ", typeClavier="
					+ typeClavier + ", osChecked=" + osChecked + ", cameraChecked=" + cameraChecked + ", microChecked="
					+ microChecked + ", projecteurChecked=" + projecteurChecked + ", hautparleurChecked="
					+ hautparleurChecked + ", buzzeurChecked=" + buzzeurChecked + ", hiddenChecked=" + hiddenChecked
					+ ", activerSshChecked=" + activerSshChecked + ", progressValue=" + progressValue + "]";
		}
		
		
		
	}


