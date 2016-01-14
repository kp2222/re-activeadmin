(ns re-activeadmin.views
    (:require [re-frame.core :as re-frame]))



(defn header-panel []
  (let [config (re-frame/subscribe [:config])]
    (fn []
      [:div
       [:div (:app-name @config)]
       [:div "status updates comes here"]])))
  

;; home



(defn admin-app []
  (fn []
    [:div
     [header-panel]
     [:div (str "content here")]]))



