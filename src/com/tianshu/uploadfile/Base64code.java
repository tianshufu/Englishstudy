package com.tianshu.uploadfile;

import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class Base64code {
    public static void main(String[] args) {
      Base64code base64code=new Base64code();
      //String decoded=base64code.base64Decode("eyJrZXkiOiAidHJ5NCIsICJoYXNoIjogIkZvRndnUGJha2VuR2lZdWwwNHRneWV4azdoWHciLCAidyI6IDEwODAsICJoIjogMTkyMH0=");
      //System.out.println(decoded);
        base64code.getkey("{\"key\": \"try4\", \"hash\": \"FoFwgPbakenGiYul04tgyexk7hXw\", \"w\": 1080, \"h\": 1920}");
    }

    public static String base64Decode(String value) {
        try {
            byte[] decodedValue = Base64.getDecoder().decode(value);
            return new String(decodedValue, StandardCharsets.UTF_8.toString());
        } catch(UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }

    public String getkey(String decodestring)
    {
        Gson gson = new Gson();
        Map<String, Object> map = new HashMap<String, Object>();
        map = gson.fromJson(decodestring, map.getClass());
        String keyvalue=(String) map.get("key");
        System.out.println("map的值为:"+keyvalue);
        return  keyvalue;
    }


}

