package com.mycompany.pages;

// Import(s)
import com.mycompany.api.*;
import com.mycompany.covidsystem.ControlPanel;
import com.mycompany.entity.*;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;
import javax.swing.*;

/**
 * This class represents the search booking page
 */
public class SearchBookingPage extends javax.swing.JPanel {

    // Manually included variable(s)
    private static final APIFactory<Booking> bookingFactory = FactoryCreator.getBookingFactory();
    private List<Booking> bookings = new ArrayList<>();
    private Booking currentBooking;
    public static final String INITIATED = "INITIATED";
    public static final String CANCELLED = "CANCELLED";
    private static final ControlPanel controlPanel = ControlPanel.getControlPanel();

    /**
     * Creates new form SearchBookingPage
     */
    public SearchBookingPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchPanel = new javax.swing.JPanel();
        searchPanelLabel = new javax.swing.JLabel();
        searchBookingIdLabel = new javax.swing.JLabel();
        searchBookingIdTextField = new javax.swing.JTextField();
        searchPinLabel = new javax.swing.JLabel();
        searchPinTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        detailsPanel = new javax.swing.JPanel();
        detailsPanelLabel = new javax.swing.JLabel();
        bookingIdLabel = new javax.swing.JLabel();
        bookingIdTextField = new javax.swing.JTextField();
        customerNameLabel = new javax.swing.JLabel();
        customerNameTextField = new javax.swing.JTextField();
        testingSiteNameLabel = new javax.swing.JLabel();
        testingSiteNameTextField = new javax.swing.JTextField();
        createdAtLabel = new javax.swing.JLabel();
        createdAtTextField = new javax.swing.JTextField();
        startTimeLabel = new javax.swing.JLabel();
        startTimeTextField = new javax.swing.JTextField();
        notesLabel = new javax.swing.JLabel();
        notesTextField = new javax.swing.JTextField();
        pinLabel = new javax.swing.JLabel();
        pinTextField = new javax.swing.JTextField();
        customerUsernameLabel = new javax.swing.JLabel();
        customerUsernameTextField = new javax.swing.JTextField();
        testingSiteIdLabel = new javax.swing.JLabel();
        testingSiteIdTextField = new javax.swing.JTextField();
        updatedAtLabel = new javax.swing.JLabel();
        updatedAtTextField = new javax.swing.JTextField();
        statusLabel = new javax.swing.JLabel();
        statusTextField = new javax.swing.JTextField();
        actionsPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        verifyIdentityLabel = new javax.swing.JLabel();
        verifyIdentityTextField = new javax.swing.JTextField();
        verifyIdentityButton = new javax.swing.JButton();
        cancelBookingButton = new javax.swing.JButton();
        modifyBookingButton = new javax.swing.JButton();

        searchPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        searchPanelLabel.setText("Search");

        searchBookingIdLabel.setText("Booking ID:");

        searchPinLabel.setText("PIN:");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchPanelLabel)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(searchBookingIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBookingIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchPinLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchPinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchPanelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBookingIdLabel)
                    .addComponent(searchBookingIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPinLabel)
                    .addComponent(searchPinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        detailsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        detailsPanelLabel.setText("Details");

        bookingIdLabel.setText("Booking ID:");

        bookingIdTextField.setEditable(false);
        bookingIdTextField.setColumns(21);

        customerNameLabel.setText("Customer Name:");

        customerNameTextField.setEditable(false);
        customerNameTextField.setColumns(21);

        testingSiteNameLabel.setText("Testing Site Name:");

        testingSiteNameTextField.setEditable(false);
        testingSiteNameTextField.setColumns(21);

        createdAtLabel.setText("Created At:");

        createdAtTextField.setEditable(false);
        createdAtTextField.setColumns(21);

        startTimeLabel.setText("Start Time:");

        startTimeTextField.setEditable(false);
        startTimeTextField.setColumns(21);

        notesLabel.setText("Notes:");

        notesTextField.setEditable(false);
        notesTextField.setColumns(21);

        pinLabel.setText("PIN:");

        pinTextField.setEditable(false);
        pinTextField.setColumns(21);

        customerUsernameLabel.setText("Customer Username:");

        customerUsernameTextField.setEditable(false);
        customerUsernameTextField.setColumns(21);

        testingSiteIdLabel.setText("Testing Site ID:");

        testingSiteIdTextField.setEditable(false);
        testingSiteIdTextField.setColumns(21);

        updatedAtLabel.setText("Updated At:");

        updatedAtTextField.setEditable(false);
        updatedAtTextField.setColumns(21);

        statusLabel.setText("Status:");

        statusTextField.setEditable(false);
        statusTextField.setColumns(21);

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsPanelLabel)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detailsPanelLayout.createSequentialGroup()
                                .addComponent(notesLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(notesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detailsPanelLayout.createSequentialGroup()
                                .addComponent(startTimeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(startTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detailsPanelLayout.createSequentialGroup()
                                .addComponent(createdAtLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createdAtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detailsPanelLayout.createSequentialGroup()
                                .addComponent(bookingIdLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bookingIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detailsPanelLayout.createSequentialGroup()
                                .addComponent(customerNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerUsernameLabel)
                            .addComponent(pinLabel)
                            .addComponent(updatedAtLabel)
                            .addComponent(statusLabel))
                        .addGap(18, 18, 18)
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatedAtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testingSiteIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addComponent(testingSiteNameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(testingSiteNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(testingSiteIdLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        detailsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bookingIdTextField, createdAtTextField, customerNameTextField, notesTextField, startTimeTextField, testingSiteNameTextField});

        detailsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {customerUsernameTextField, pinTextField, statusTextField, testingSiteIdTextField, updatedAtTextField});

        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailsPanelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingIdLabel)
                    .addComponent(bookingIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pinLabel)
                    .addComponent(pinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameLabel)
                    .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerUsernameLabel)
                    .addComponent(customerUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(testingSiteNameLabel)
                    .addComponent(testingSiteNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testingSiteIdLabel)
                    .addComponent(testingSiteIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createdAtLabel)
                    .addComponent(createdAtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatedAtLabel)
                    .addComponent(updatedAtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startTimeLabel)
                    .addComponent(startTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusLabel)
                    .addComponent(statusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notesLabel)
                    .addComponent(notesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        actionsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        verifyIdentityLabel.setText("Verify Identity:");

        verifyIdentityButton.setText("Verify");
        verifyIdentityButton.setEnabled(false);
        verifyIdentityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyIdentityButtonActionPerformed(evt);
            }
        });

        cancelBookingButton.setText("Cancel Booking");
        cancelBookingButton.setEnabled(false);
        cancelBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBookingButtonActionPerformed(evt);
            }
        });

        modifyBookingButton.setText("Modify Booking");
        modifyBookingButton.setEnabled(false);
        modifyBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBookingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actionsPanelLayout = new javax.swing.GroupLayout(actionsPanel);
        actionsPanel.setLayout(actionsPanelLayout);
        actionsPanelLayout.setHorizontalGroup(
            actionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cancelBookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modifyBookingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutButton)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verifyIdentityLabel)
                .addGap(18, 18, 18)
                .addComponent(verifyIdentityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verifyIdentityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );

        actionsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backButton, logoutButton});

        actionsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelBookingButton, modifyBookingButton});

        actionsPanelLayout.setVerticalGroup(
            actionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(actionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verifyIdentityLabel)
                    .addComponent(verifyIdentityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verifyIdentityButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(actionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButton)
                    .addComponent(backButton)
                    .addComponent(cancelBookingButton)
                    .addComponent(modifyBookingButton))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(actionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detailsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // This method obtains the list of bookings from the web service
    public void getBookings()
    {
        try
        {
            Get<Booking> bookingGet = bookingFactory.createGet();
            bookings = bookingGet.createGetRequest();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    // This method resets TextFields and Buttons
    private void resetTextFieldsAndButtons()
    {
        searchBookingIdTextField.setText("");
        searchPinTextField.setText("");
        verifyIdentityTextField.setText("");
        verifyIdentityButton.setEnabled(false);
        cancelBookingButton.setEnabled(false);
        modifyBookingButton.setEnabled(false);   
    }
    
    // This method clears details of TextFields
    private void clearDetails()
    {
        bookingIdTextField.setText("");
        
        pinTextField.setText("");
        
        customerNameTextField.setText("");
        
        customerUsernameTextField.setText("");
        
        testingSiteNameTextField.setText("");
        
        testingSiteIdTextField.setText("");
        
        createdAtTextField.setText("");
        
        updatedAtTextField.setText("");
        
        startTimeTextField.setText("");
        
        statusTextField.setText("");
        
        notesTextField.setText("");
    }
    
    // This method sets details of TextFields
    private void setDetails(Booking booking)
    {
        String bookingId = booking.getId();
        bookingIdTextField.setText(bookingId);
        
        String smsPin = booking.getSmsPin();
        pinTextField.setText(smsPin);
        
        String name = booking.getCustomer().getGivenName() + ", " + booking.getCustomer().getFamilyName();
        customerNameTextField.setText(name);
        
        String customerUsername = booking.getCustomer().getUsername();
        customerUsernameTextField.setText(customerUsername);
        
        String testingSiteName = booking.getTestingSite().getName();
        testingSiteNameTextField.setText(testingSiteName);
        
        String testingSiteId = booking.getTestingSite().getId();
        testingSiteIdTextField.setText(testingSiteId);
        
        String createdAt = booking.getCreatedAt();
        createdAtTextField.setText(createdAt);
        
        String updatedAt = booking.getUpdatedAt();
        updatedAtTextField.setText(updatedAt);
        
        String startTime = booking.getStartTime();
        startTimeTextField.setText(startTime);
        
        String status = booking.getStatus();
        statusTextField.setText(status);
        
        String notes = booking.getNotes();
        notesTextField.setText(notes);
    }

    // This method checks whether a booking can be modified or not
    private boolean checkIfModifiable(Booking booking)
    {
        // Three conditions
        // Check if start time of booking has lapsed or not
        // Check if status of booking is "INITIATED" or not
        // Check if booking is for home testing or not
        
        // Check if start time of booking has lapsed or not
        // If the booking to modify has the same date as current date
        // The booking can no longer be modified
        Instant currentInstant = Instant.now();
        Instant compareCurrentDate = currentInstant.truncatedTo(ChronoUnit.DAYS);
        
        String startTime = booking.getStartTime();
        Instant bookingInstant = Instant.parse(startTime);
        Instant compareBookingDate = bookingInstant.truncatedTo(ChronoUnit.DAYS);
                
        int value = compareCurrentDate.compareTo(compareBookingDate);
        
        // If value is equal to or more than 0, it means that the start time of booking has lapsed
        if ((value == 0) || (value > 0))
        {
            JOptionPane.showMessageDialog(null, "Booking has lapsed, it can no longer be modified", "Booking Has Lapsed", JOptionPane.ERROR_MESSAGE);        
            return false;
        }
        // If the start time of booking has not lapsed
        // Check for the status of booking
        else
        {
            // If the status of booking is not "INITIATED", then the booking can no longer be modified
            if (booking.getStatus().equals(INITIATED) == false)
            {
                JOptionPane.showMessageDialog(null, "Booking status is not INITIATED, it can no longer be modified", "Booking Status", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            else
            {
                // If it is a booking for home testing, it cannot be modified
                if ((booking.getAdditionalInfo().getQrCode() != null) || (booking.getAdditionalInfo().getUrl() != null) || (booking.getAdditionalInfo().getRatKit() != null))
                {
                    JOptionPane.showMessageDialog(null, "Booking for home testing cannot be modified", "Home Testing Booking", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                else
                {
                    return true;
                }
            }
        }
    }
    
    // This method searches for a booking based on given booking ID or PIN
    // Then, it calls checkIfModifiable
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String enteredBookingId = searchBookingIdTextField.getText();
        String enteredPin = searchPinTextField.getText();
        
        // Reset displayed booking details
        clearDetails();
        
        // Search using either booking ID or PIN
        // If at least one of them is not empty
        Boolean exist = false;
        if (enteredBookingId.isBlank() == false)
        {
            for (Booking booking: bookings)
            {
                if (enteredBookingId.equals(booking.getId()))
                {
                    exist = true;
                    setDetails(booking);
                    currentBooking = booking;
                    
                    // Check if booking can be modified or not
                    boolean modifiable = checkIfModifiable(currentBooking);
                    if (modifiable == true)
                    {
                        verifyIdentityButton.setEnabled(true);
                    }
                }
            }
            
            if (exist == false)
            {
                JOptionPane.showMessageDialog(null, "Please enter a valid booking ID", "Booking Not Found", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (enteredPin.isBlank() == false)
        {
            for (Booking booking: bookings)
            {
                if (enteredPin.equals(booking.getSmsPin()))
                {
                    exist = true;
                    setDetails(booking);
                    currentBooking = booking;
                    
                    // Check if booking can be modified or not
                    boolean modifiable = checkIfModifiable(currentBooking);
                    if (modifiable == true)
                    {
                        verifyIdentityButton.setEnabled(true);
                    }
                }
            }
            
            if (exist == false)
            {
                JOptionPane.showMessageDialog(null, "Please enter a valid PIN", "Booking Not Found", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid booking ID or PIN", "Booking Not Found", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    // This method compares if the entered customer ID is the same as the booking's customer ID
    // If it is the same, enable cancel and modify buttons
    private void verifyIdentityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyIdentityButtonActionPerformed
        String enteredCustomerId = verifyIdentityTextField.getText();
        
        // If the provided customer ID matches the current booking's customer ID
        // Identity is verified successfully
        if (currentBooking.getCustomer().getId().equals(enteredCustomerId))
        {
            JOptionPane.showMessageDialog(null, "Verification is successful", "Successful Verification", JOptionPane.INFORMATION_MESSAGE);
            cancelBookingButton.setEnabled(true);
            modifyBookingButton.setEnabled(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Verification is unsuccessful, please try again", "Unsuccessful Verification", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_verifyIdentityButtonActionPerformed

    // This method patches the status of a booking
    private void cancelBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBookingButtonActionPerformed
        
        // Set the status of booking to "CANCELLED"
        // This ensures that the booking cannot be modified in the future
        try
        {
            Patch bookingPatch = bookingFactory.createPatch();
            bookingPatch.createPatchRequest(CANCELLED, currentBooking.getId());
            JOptionPane.showMessageDialog(null, "Booking has been cancelled successfully", "Successful Cancellation", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        // After cancelling a booking, call web service again to get the updated list of bookings
        try
        {
            Get<Booking> bookingGet = bookingFactory.createGet();
            bookings = bookingGet.createGetRequest();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cancelBookingButtonActionPerformed

    // This method leads to the ModifyBookingPage
    private void modifyBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBookingButtonActionPerformed
        clearDetails();
        searchBookingIdTextField.setText("");
        searchPinTextField.setText("");
        verifyIdentityTextField.setText("");
        controlPanel.showModifyBookingPage(currentBooking);
    }//GEN-LAST:event_modifyBookingButtonActionPerformed

    // This method allows the user to navigate to different pages
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        clearDetails();
        resetTextFieldsAndButtons();
        controlPanel.showReceptionistPage();
    }//GEN-LAST:event_backButtonActionPerformed

    // This method brings the user back to the login page
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        clearDetails();
        resetTextFieldsAndButtons();
        controlPanel.logOut();
    }//GEN-LAST:event_logoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionsPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bookingIdLabel;
    private javax.swing.JTextField bookingIdTextField;
    private javax.swing.JButton cancelBookingButton;
    private javax.swing.JLabel createdAtLabel;
    private javax.swing.JTextField createdAtTextField;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JLabel customerUsernameLabel;
    private javax.swing.JTextField customerUsernameTextField;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JLabel detailsPanelLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton modifyBookingButton;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JTextField notesTextField;
    private javax.swing.JLabel pinLabel;
    private javax.swing.JTextField pinTextField;
    private javax.swing.JLabel searchBookingIdLabel;
    private javax.swing.JTextField searchBookingIdTextField;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JLabel searchPanelLabel;
    private javax.swing.JLabel searchPinLabel;
    private javax.swing.JTextField searchPinTextField;
    private javax.swing.JLabel startTimeLabel;
    private javax.swing.JTextField startTimeTextField;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextField statusTextField;
    private javax.swing.JLabel testingSiteIdLabel;
    private javax.swing.JTextField testingSiteIdTextField;
    private javax.swing.JLabel testingSiteNameLabel;
    private javax.swing.JTextField testingSiteNameTextField;
    private javax.swing.JLabel updatedAtLabel;
    private javax.swing.JTextField updatedAtTextField;
    private javax.swing.JButton verifyIdentityButton;
    private javax.swing.JLabel verifyIdentityLabel;
    private javax.swing.JTextField verifyIdentityTextField;
    // End of variables declaration//GEN-END:variables
}
