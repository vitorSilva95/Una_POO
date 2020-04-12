/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rh.Repositorio;

import br.com.rh.Cargo;
import java.util.*;

/**
 *
 * @author Vitor Oliveira Silva
 */
public class CargoRepositorio {
    private static List<Cargo> cargos = new ArrayList<Cargo>();
    public static void addCargo(Cargo cargo){
        cargos.add(cargo);
    }
    
    public static Cargo getCargo(String cargo){
        return cargos.stream().filter(c -> cargo.equals(c.getNomeCargo())).findFirst().orElse(new Cargo("",""));
    }
    
    public static boolean cargoExists(String cargo){
        return cargos.stream().anyMatch(c -> (cargo == null ? c.getNomeCargo() == null : cargo.equals(c.getNomeCargo())));
    }
}
