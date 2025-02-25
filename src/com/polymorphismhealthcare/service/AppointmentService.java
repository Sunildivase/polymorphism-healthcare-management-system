package com.polymorphismhealthcare.service;

import com.polymorphismhealthcare.model.Appointment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AppointmentService {

    private static final Scanner scanner = new Scanner(System.in);

    Map<Integer , Appointment> appointments = new HashMap<>();

    void printAppointment(Appointment appointment){
        System.out.println(appointment);
    }

    public Appointment createAppointment(){

        System.out.println("please enter appointment Id ");
        int appointmentId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter personId");
        int personId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter doctorId");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospitalId");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter deptId");
        int deptId = Integer.parseInt(scanner.nextLine());

        Appointment appointment = new Appointment();
        appointment.setAppointmentId(appointmentId);
        appointment.setPersonId(personId);
        appointment.setDoctorId(doctorId);
        appointment.setHospitalId(hospitalId);
        appointment.setDeptId(deptId);

        appointments.put(appointmentId,appointment);
        return appointment;
    }
    public void displayAppointment(){

        Set<Map.Entry<Integer,Appointment>> entrySet = appointments.entrySet();
        for(Map.Entry<Integer,Appointment> appointmentEntry : entrySet){
            System.out.println("key: "+appointmentEntry.getKey()+" "+"value: "+appointmentEntry.getValue());
        }
    }

    public Appointment deleteAppointment(int appointmentId){
        Appointment removedAppointment = appointments.remove(appointmentId);
        System.out.println("removed appointment: "+removedAppointment);
        return removedAppointment;
    }
}
