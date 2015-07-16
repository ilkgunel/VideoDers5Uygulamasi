package com.mycompany.videoders5uygulamasi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean
@RequestScoped
public class FormValidationBean {
private String isim;
private String soyisim;
private String il;
private String esposta;
private String linkedinkullaniyormusunuz;
private String cinsiyet;
private String adres;
private String parola;
private static Map<String,Object> cinsiyetler=new LinkedHashMap<String,Object>();
private static Map<String,Object> iller=new LinkedHashMap<String,Object>();
private static Map<String,Object> hesapvarmi=new LinkedHashMap<String,Object>();
private Map<String,Object> hobilistesi=new LinkedHashMap<String,Object>();
private String[] hobiler=new String[7];
private String yabanci_dil_seviyesi;
private Map<String,Object> ydseviyeler=new LinkedHashMap<String,Object>();

//Yapılandırıcılardan hemen sonra çalışan metot.
@PostConstruct
public void hobiListesiniDoldur()
{
    hobilistesi.put("Kitap Okumak", "Kitap Okumak");
    hobilistesi.put("Futbol Maçı İzleme", "Futbol Maçı İzleme");
    hobilistesi.put("Koleksiyonlar", "Koleksiyonlar");
    hobilistesi.put("Tiyatro ve Sinema", "Tiyatro ve Sinema");
    hobilistesi.put("Formula 1", "Formula 1");
    hobilistesi.put("Gastronomi", "Gastronomi");
    hobilistesi.put("Avcılık", "Avcılık");
}

public Map<String, Object> getHobilistesi() {
	return hobilistesi;
}

//static olmayan değişkenleri bu şekilde doldurabiliriz
{
    ydseviyeler.put("İyi", "İyi");
    ydseviyeler.put("Orta", "Orta");
    ydseviyeler.put("Yok", "Yok");
}


public Map<String,Object> ydseviyeleridondur()
{
    return ydseviyeler;
}

//Bu metot kullanıcının seçtiği şeyleri anlamamız için lazım. Aksi takdirde referans görürüz.
public String hobileriStringecevir()
{
    return Arrays.toString(hobiler);
}

static{
    iller.put("İSTANBUL", "İSTANBUL");
    iller.put("ANKARA", "ANKARA");
    iller.put("SAMSUN","SAMSUN");
    iller.put("ADANA", "ADANA");
    iller.put("ESKİŞEHŞİR", "ESKİŞEHİR");
}

//Static nesneler bu şekilde JSF'den çağırılabilir. Bunun haricinde JSF static nesneleri size göstermez.(Kod tamamlamada)
public Map<String,Object> illeridondur()
{
    return iller;
}

static
{
    cinsiyetler.put("Erkek", "Erkek");
    cinsiyetler.put("Bayan", "Bayan");
}

public Map<String,Object> cinsiyetleridondur()
{
    return cinsiyetler;
}

static
{
    hesapvarmi.put("Evet", "Evet");
    hesapvarmi.put("Hayır", "Hayır");
}

public Map<String,Object> hesapvarmidondur()
{
    return hesapvarmi;
}
    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
    public static Map<String, Object> getCinsiyetler() {
        return cinsiyetler;
    }

    public static void setCinsiyetler(Map<String, Object> cinsiyetler) {
        FormValidationBean.cinsiyetler = cinsiyetler;
    }

    public static Map<String, Object> getHesapvarmi() {
        return hesapvarmi;
    }

    public static void setHesapvarmi(Map<String, Object> hesapvarmi) {
        FormValidationBean.hesapvarmi = hesapvarmi;
    }

    
    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Map<String, Object> getIller() {
        return iller;
    }

    public void setIller(Map<String, Object> iller) {
        this.iller = iller;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getEsposta() {
        return esposta;
    }

    public void setEsposta(String esposta) {
        this.esposta = esposta;
    }

    public String getLinkedinkullaniyormusunuz() {
        return linkedinkullaniyormusunuz;
    }

    public void setLinkedinkullaniyormusunuz(String linkedinkullaniyormusunuz) {
        this.linkedinkullaniyormusunuz = linkedinkullaniyormusunuz;
    }

    public String[] getHobiler() {
        return hobiler;
    }

    public void setHobiler(String[] hobiler) {
        this.hobiler = hobiler;
    }
    
    public String getYabanci_dil_seviyesi() {
        return yabanci_dil_seviyesi;
    }

    public void setYabanci_dil_seviyesi(String yabanci_dil_seviyesi) {
        this.yabanci_dil_seviyesi = yabanci_dil_seviyesi;
    }
    
    public Map<String, Object> getYdseviyeler() {
		return ydseviyeler;
	}   
    
}