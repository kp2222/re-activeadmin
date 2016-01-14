(ns re-activeadmin.core
    (:require [reagent.core :as reagent]
              [re-frame.core :as re-frame]
              [re-activeadmin.handlers]
              [re-activeadmin.subs]
              [re-activeadmin.routes :as routes]
              [re-activeadmin.views :as views]
              [re-activeadmin.config :as config]))

(when config/debug?
  (println "dev mode"))

(defn mount-root []
  (reagent/render [views/admin-app]
                  (.getElementById js/document "app")))

(defn ^:export init [] 
  (routes/app-routes)
  (re-frame/dispatch-sync [:initialize-db])
  (mount-root))
