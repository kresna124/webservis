package id.ac.unpas.sab.webservis;

class BiodataActivity extends KoneksiActivity  {
    String URL = "http://192.168.100.5/WebServis/Mahasiswa/server.php";
    String url = "";
    String response = "";

    public String tampilBiodata() {
        try {
            url = URL + "?operasi=view";
            System.out.println("URL Tampil Biodata : " + url);
            response = call(url);
        }
        catch (Exception e) {
        }
        return response;
    }

    public String insertBiodata(String nama, String alamat) {
        try {
            url = URL + "?operasi=insert&nama=" + nama + "&alamat=" + alamat;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        }
        catch (Exception e) {
        }
        return  response;
    }

    public String getBiodataById (int id) {
        try {
            url = URL + "?operasi=get_biodata_by_id&id=" + id;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        }
        catch (Exception e) {
        }
        return response;
    }

    public String updateBiodata (String id, String nama, String alamat) {
        try {
            url = URL + "?operasi=update&id=" + id + "&nama=" + nama + "&alamat=" + alamat;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        }
        catch (Exception e) {
        }
        return response;
    }

    public String deleteBiodata (int id) {
        try {
            url = URL + "?operasi=delete&id=" + id;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        }
        catch (Exception e) {
        }
        return response;
    }
}
