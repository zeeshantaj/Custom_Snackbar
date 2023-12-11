  Snackbar snackbar = Snackbar.make(constraintLayout, "", Snackbar.LENGTH_INDEFINITE);
                    View customSnackbarView = getLayoutInflater().inflate(R.layout.custom_snackbar, null);
                    snackbar.getView().setBackgroundColor(Color.TRANSPARENT); // Make Snackbar background transparent
                    @SuppressLint("RestrictedApi") Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
                    snackbarLayout.addView(customSnackbarView, 0);

// Find the buttons in the custom layout
                    Button btnView = customSnackbarView.findViewById(R.id.btnView);
                    Button btnDismiss = customSnackbarView.findViewById(R.id.btnDismiss);

// Set click listeners for the buttons
                    btnView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            startActivity(new Intent(Booking_Activity.this, Profile_Activity.class));
                            snackbar.dismiss(); // Dismiss the snackbar if needed
                        }
                    });

                    btnDismiss.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            snackbar.dismiss(); // Dismiss the snackbar if needed
                            // Your negative action logic here
                        }
                    });

                    snackbar.show();
