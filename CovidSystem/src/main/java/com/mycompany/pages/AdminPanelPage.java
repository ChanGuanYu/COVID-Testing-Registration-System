package com.mycompany.pages;

// Import(s)
import com.mycompany.api.APIFactory;
import com.mycompany.api.FactoryCreator;
import com.mycompany.api.Get;
import com.mycompany.entity.Booking;
import com.mycompany.entity.User;
import com.mycompany.covidsystem.ControlPanel;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.table.DefaultTableModel;

/**
 * This class represents the admin panel page
 */
public class AdminPanelPage extends javax.swing.JPanel {
    
    // Manually included variable(s)
    private static final ControlPanel controlPanel = ControlPanel.getControlPanel();
    private static User currentUser;
    private List<Booking> bookings = new ArrayList<>();
    private List<Booking> testingSiteBookings;
    private static final APIFactory<Booking> bookingFactory = FactoryCreator.getBookingFactory();
    private String testingSiteId;

    /**
     * Creates new form AdminPanelPage
     */
    public AdminPanelPage() {
        initComponents();
    }
    
    //Get all bookings from the testing site that the admin is working at
    public void getTestingSiteBookings(){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
          @Override
          public void run() {
            testingSiteBookings = new ArrayList<>();

            testingSiteId = currentUser.getAdditionalInfo().getTesingSiteId();
            try{
                Get<Booking> bookingGet = bookingFactory.createGet();
                bookings = bookingGet.createGetRequest();
            }catch (Exception e)
            {
                e.printStackTrace();
            }

            for (Booking booking: bookings){
                if (booking.getTestingSite().getId().equals(testingSiteId)){
                    testingSiteBookings.add(booking);
                }
            }

            showTestingSiteBookings();
          }
        }, 0, 5000);//wait 0 ms before doing the action and do it evry 5000ms (5seconds)
    }
    
    //show all bookings from the testing site that the admin is working at
    public void showTestingSiteBookings(){
        String bookingId;
        String customerId;
        String startTime;
        String updatedAt;
        String status;
        List<String[]> listofdata = new ArrayList<String[]>();
        
        //get specify infos from each booking and store in a list
        for (Booking booking: testingSiteBookings){
            bookingId = booking.getId();
            customerId = booking.getCustomer().getId();
            startTime = booking.getStartTime();
            updatedAt = booking.getUpdatedAt();
            status = booking.getStatus();
            
            String data[] = {bookingId, customerId, startTime, updatedAt, status};
            listofdata.add(data);
        }
        
        //Start comparing which booking has the most recent update
        String currUpdatedAt = listofdata.get(0)[3];
        int index = 0;
        int count = 0;
        String[] mostRecentUpdate = {};
        //strat looping from 2nd index
        for (String[] data: listofdata.subList(1, listofdata.size())){
            Instant updatedBooking = Instant.parse(currUpdatedAt);
            
            String nextUpdatedAt = data[3];
            Instant compareUpdatedBooking = Instant.parse(nextUpdatedAt);
            int value = updatedBooking.compareTo(compareUpdatedBooking);
            
            count ++;
            //if current booking's updated time is before the next booking's updated time
            if(value <0){
                currUpdatedAt = nextUpdatedAt;
                index = count;
                mostRecentUpdate = data;
            }
        }
        
        //move the most recently updated booking to the top of the list
        listofdata.remove(index);
        listofdata.add(0, mostRecentUpdate);
        DefaultTableModel tblModel = (DefaultTableModel)adminPanelTable.getModel();
        tblModel.setRowCount(0);//reset table before repopulating with new data       
        
        //add list of datas into table
        for (String[] data: listofdata){
            tblModel.addRow(data);
        }
        
    }
    
    public void setAdminUser(User user){
        currentUser = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        adminPanelTable = new javax.swing.JTable();
        adminPanelLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        adminPanelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking Id", "Customer Id", "Start Time", "Updated At", "Status"
            }
        ));
        adminPanelTable.setEnabled(false);
        jScrollPane1.setViewportView(adminPanelTable);

        adminPanelLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        adminPanelLabel.setText("Admin Panel");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(adminPanelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(adminPanelLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // This method allows the user to navigate to different pages
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        controlPanel.showReceptionistPage();
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminPanelLabel;
    private javax.swing.JTable adminPanelTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}